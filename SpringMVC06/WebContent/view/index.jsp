<%@ page language="java"  import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>
<body>
	<h1 align='center'>LOGIN SUCCESS and CONGRATULATION</h1>
	<hr color='red' />
	<h3 align='center'>您的登录信息</h3>
	<%   Date date=new Date();
	out.print("登录时间:" + date.toLocaleString());
	%>
	<hr color='blue' />
	<p align='center'>
		<b>姓名:</b>${username}<br/>
		<b>性别:</b>${gender}<br/>
		<b>技能:</b>
	</p>
		<table bgcolor="#DAA520" align="center"  border="100%" style="border: 1px solid gray; border-collaspe: collaspe;">
		 <tr>
		 <c:forEach var="skill" items="${skill}">
		  <td align="center">${skill}</td>
		 </c:forEach>
		 </tr>
		</table>
		
</body>
</html>