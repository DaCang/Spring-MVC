<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
	<form  action="hello" method="post">
		用户名<input type="text" name="username" /> <br /> 
		密码<input type="password" name="userpsw"> <br /> 
		性别<br /> 
		<input type="radio" checked="checked" name="gender" value="男">男<br /> 
		<input type="radio" checked="checked" name="gender" value="女">女<br />
		 <input type="submit" value="login" /><br />
	</form>
	<p><a href="user.do">根据BeanName访问Controller</a></p>
	<p><a href="userInfo.do">根据SimpleUrl访问Controller</a></p>
	<p><a href="userController.do">根据ControllerClassName访问Controller</a></p>
</body>
</html>