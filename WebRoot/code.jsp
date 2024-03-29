<%@ page language="java" import="java.util.*,java.awt.*,java.awt.image.*,javax.imageio.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'code.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%!  
    Color getRandColor(int fc,int bc){  
        Random random = new Random();  
        if(fc > 255){  
            fc = 255;  
        }  
        if(bc < 255){  
            bc = 255;  
        }  
        int r = fc +random.nextInt(bc-fc);  
        int g = fc +random.nextInt(bc-fc);  
        int b = fc +random.nextInt(bc-fc);  
          
          
        return new Color(r,g,b);  
    }  
%>  
  </head>
  
  <body>

  
<%   
    //设置页面不缓存  
    response.setHeader("Pragma","no-cache");  
    response.setHeader("Cache-Control","no-catch");  
    response.setDateHeader("Expires",0);  
      
    //在内存中创建图象  
    int width = 60;  
    int height = 20;  
    BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);  
      
    //创建图象  
    Graphics g = image.getGraphics();  
    //生成随机对象  
    Random random = new Random();  
    //设置背景色  
    g.setColor(getRandColor(200,250));  
    g.fillRect(0,0,width,height);  
    //设置字体  
    g.setFont(new Font("Tines Nev Roman",Font.PLAIN,18));  
    //随机产生干扰线  
    g.setColor(getRandColor(160,200));  
    for(int i = 0; i < 255; i++){  
        int x = random.nextInt(width);  
        int y = random.nextInt(height);  
        int xl = random.nextInt(12);  
        int yl = random.nextInt(12);  
    }  
    //随机产生认证码,4位数字  
    String sRand = "";  
    for(int i = 0; i < 4; i++){  
        String rand = String.valueOf(random.nextInt(10));  
        sRand  += rand;  
        //将认证码显示到图象中  
        g.setColor(new Color(20 + random.nextInt(110),20 + random.nextInt(110),20 + random.nextInt(110)));  
        g.drawString(rand,13*i+6,16);  
    }  
    session.setAttribute("rCode",sRand);  
    //图像生效  
    g.dispose();  
    //输出图像到页面  
    ImageIO.write(image,"JPEG",response.getOutputStream());  
    out.clear();  
    out = pageContext.pushBody();  
%>  

  </body>
</html>
