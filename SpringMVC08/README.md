#Spring MVC Ajax demo
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
