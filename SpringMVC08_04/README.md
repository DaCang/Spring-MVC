### ListService逻辑代码优化
***
这里优化了几处查询条件
>in [ListService.java](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC08_04/src/com/songyl/webmvc/service/ListService.java) 

1. 查询条件为空

2. 查询条件不在数据库

3. 查询条件中的字符串不能解析为一个整数

	  	public UserInfo selectOne(String id) {
	 	UserInfo user = new UserInfo();
	 	UserInfoDao userInfoDao = new UserInfoDao();

		if (id != null && !"".equals(id)) {
	    	Pattern pattern = Pattern.compile("[0-9]*");
	    	Matcher isNum = pattern.matcher(id);
	    	if (!isNum.matches()) {
			user.setUserName("NONE");
			user.setAge(0);
			user.setNotes("请输入数字！！");
	    	} else {
				int userID = Integer.valueOf(id);
				List<UserInfo> list = userInfoDao.selectOne(userID);
				user.setUserId(Integer.valueOf(userID));
					if (list.isEmpty()) {
		    			user.setUserName("NONE");
		    			user.setAge(0);
		   				user.setNotes("没有此人!!!!!");
					} else {
		    			UserInfo userInfo = list.get(0);
		    			user.setUserName(userInfo.getUserName());
		    			user.setAge(userInfo.getAge());
		    			user.setNotes(userInfo.getNotes());
					}
	    	}
		} else {
	    	user.setUserId(null);
	    	user.setUserName(null);
	    	user.setAge(null);
	    	user.setNotes(null);
		}
		return user;
   	 	}
