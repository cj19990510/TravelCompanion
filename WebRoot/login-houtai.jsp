<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理登录</title>
</head>
<body>
<script src="js/jquery-latest.min.js"></script>
<div style="text-align:center; background-image:url(images/login.jpg);width:100%;height:100%;position: absolute; ">
<img src="images/logo_3.png" style="left:12px;top:10px;position: absolute;" />
   <br/><br/><br/>
   <h1 style="color:steelblue;font-size:40px; font-family:LiSu">伴旅后台管理登录</h1>
   <div id="link_student" align="center" >
   <form action="login" method="post">
   <table style="text-align:center;" width="500" >
       <TR>
          <TD colspan="2" align="center" style="font-size:25px;font-family:STXingkai">管理员登录</TD>
       </TR>
       <TR>
          <TD id="msg" name="msg" colspan="2" align="center" style="font-size:15px;color:red;">
          <span style="color:red;"> ${msg}</span>
          </TD>
       </TR>
       <TR>
          <TD align="right" width="35%" >账号：</TD>
          <TD align="left" width="65%"><INPUT TYPE="text" name="adminid" value="${adminid}"></TD>
       </TR>
       <TR>
          <TD align="right" width="35%" >密码：</TD>
          <TD align="left" width="65%"><INPUT TYPE="password" NAME="password"></TD>
       </TR>
       <TR>
          <TD colspan="2" align="center" style="font-size:30px;">
             <INPUT TYPE="submit" value="提　　交">
             <INPUT TYPE="reset" value="重　　置">
          </TD>
       </TR>
       <TR>
           <TD colspan="2" align="center" style="font-size:15px;">
             <a href="houtai-insert.jsp" style="font-size:20px;font-family:STXingkai">注册账号</a>
          </TD>
       </TR>
   </table>
   
   </form>
 </div>  
 
 
</div>
</body>
</html>