<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Home Of User</title>
</head>
<body>
	<p>1.HttpServletRequest request直接使用</p>
	<form  action="user/add1.do" method="post">
	       用户名<input type="text" name="username" /> <br /> 
		密码<input type="password" name="userpsw"> <br /> 
		性别<br /> 
		<input type="radio" checked="checked" name="gender" value="男">男<br /> 
		<input type="radio" checked="checked" name="gender" value="女">女<br />
		 <input type="submit" value="add1" /><br />
	</form>
	  <hr color='red' />
	 <p>2.使用ModelAndView</p>
	 <form  action="user/add2.do" method="post">
		用户名<input type="text" name="username" /> <br /> 
		密码<input type="password" name="userpsw"> <br /> 
		性别<br /> 
		<input type="radio" checked="checked" name="gender" value="男">男<br /> 
		<input type="radio" checked="checked" name="gender" value="女">女<br />
		 <input type="submit" value="add2" /><br />
	</form>
	 <hr color='red' />
	  <p>3.使用Model model</p>
	 <form  action="user/add3.do" method="post">
		用户名<input type="text" name="username" /> <br /> 
		密码<input type="password" name="userpsw"> <br /> 
		性别<br /> 
		<input type="radio" checked="checked" name="gender" value="男">男<br /> 
		<input type="radio" checked="checked" name="gender" value="女">女<br />
		 <input type="submit" value="add3" /><br />
	</form>
	 <hr color='red' />
	 <p>4.使用Map map</p>
	<form  action="user/add4.do" method="post">
		用户名<input type="text" name="userName" /> <br /> 
		密码<input type="password" name="userPSW"> <br /> 
		性别<input type="radio" checked="checked" name="gender" value="男">男 
		   <input type="radio" checked="checked" name="gender" value="女">女<br /> 
		 <input type="submit" value="add4" /><br />
	</form>
</body>
</html>