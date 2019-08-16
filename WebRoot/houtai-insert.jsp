<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员注册</title>
</head>
<body>
  <div style="text-align:center; background-image:url(images/fronts/2.jpg);width:100%;height:100%;position: absolute; ">
     <img src="images/logo.png" style="left:12px;top:10px;position: absolute;" />
   <br/><br/><br/>
   <h1 style="color:steelblue;font-size:40px; font-family:LiSu">伴旅后台管理注册</h1>
   <div id="link_student" align="center" >
   <form id="form1" action="insert" method="post" onsubmit="">
   
   <table style="text-align:center;" width="500" >
       
       <TR>
          <TD id="msg" name="msg" colspan="2" align="center" style="font-size:15px;color:red;">
          <span style="color:red;"> ${msg}</span>
          </TD>
       </TR>
       <TR>
          <TD align="right" width="35%" >名称：</TD>
          <TD align="left" width="65%">
          <INPUT TYPE="text" name="accountName" id="adminid" onblur=fun1()></TD>
       </TR>
       <TR>
          <TD align="right" width="35%" >密码：</TD>
          <TD align="left" width="65%">
          <INPUT TYPE="password" id="password1" NAME="password1" onblur=fun2()></TD>
       </TR>
       <TR>
          <TD align="right" width="35%" >再次输入密码：</TD>
          <TD align="left" width="65%">
          <INPUT TYPE="password" id="password2" NAME="password2" onblur=fun3()></TD>
       </TR>
      
       <TR>
          <TD colspan="2" align="center" style="font-size:30px;">
             <INPUT id="submit" TYPE="submit" value="注      册">
             <INPUT TYPE="reset" value="重　　置">
          </TD>
       </TR>
   </table>
   </form>
 </div>  
 
</div>

<script src="js/jquery-latest.min.js" ></script>

<script type="text/javascript">

            var msg=document.getElementById("msg");
				function fun1(){
					var userName = document.getElementById("adminid").value;
					if(userName ==""){
						msg.innerHTML="名字不能为空";
				       return false;
				    }else{
						return true;
					}
				 }
				
				
				function fun2(){
					var password1 = document.getElementById("password1").value;
					if(password1 ==""){
						msg.innerHTML="密码不能为空";
						return false;
					}else{
						return true;
					}
				}
					
				function fun3(){
					var password1 = document.getElementById("password1").value;
					var password2 = document.getElementById("password2").value;
					if(password2 ==""){
						msg.innerHTML="请再次输入密码";
						return false;
					}else if(password1 != password2){
						msg.innerHTML="密码輸入不相同";
						return false;
					}else{
						return true;
					}
				}	
					
				
			var btn = document.getElementById("submit");
            btn.onclick = function () {
				if(fun1()&&fun2()&&fun3()){
					document.getElementById("form1").submit();
					alert("您的账号是："+${adminid});
				}
				return false;
			}
			
</script>
</body>
</html>

