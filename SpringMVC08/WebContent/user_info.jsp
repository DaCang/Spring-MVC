<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>UserInfo Home</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
        $().ready(function(){
        	$("#validator").click(function(){
        		var userNum=$("#userNum").val();
        		
        			$.post("<%=basePath%>ajaxUserId.do",{userNum:userNum},function(data)
        					{
        				alert(data);
        			});
        		
        	});
        	$("#idquery").click(function(){
        		var userId=$("#userId").val();
        		
        			$.post("<%=basePath%>ajaxUserInfo.do",{userId:userId},function(data)
        					{
        				alert("编号："+data.userId+",姓名:"+data.userName+",年龄:"+data.age);
        			},"json");
        		
        	});
	
        });
</script>
</head>
<body>
<!-- 验证帐号是否存在 -->
<hr color='red' />
账号<input id="userNum" type="text" name="userNum">
   <input id="validator" type="button" value="提交" /><br />
<hr color='red' />
编号<input id="userId" type="text" name="userId">
   <input id="idquery" type="button" value="查询" /><br />
</body>
</html>