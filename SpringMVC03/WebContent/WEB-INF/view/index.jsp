<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/javastyle">
.red {
	color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>
<body>
	<h1>LOGIN SUCCESS&&CONGRATULATION</h1>
	
	<hr color='red' />
		<p >
		<strong>您的登录信息</strong>
		</p>
	
	<div>
		<p align='center' class=red>
			<b>姓名:</b>${username}<br /> <b>性别:</b>${gender}
		</p>
	</div>
</body>
</html>