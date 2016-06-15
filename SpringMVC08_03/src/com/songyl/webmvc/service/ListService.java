package com.songyl.webmvc.service;

import java.util.List;

import com.songyl.webmvc.dao.UserInfoDao;
import com.songyl.webmvc.entity.UserInfo;

/**
 * @author Administrator
 * 跟Servlet对应，一些与userinfo列表相关的业务功能
 */
public class ListService {

    /**
     * @方法描述 TODO  把DAO层查询出来的结果返回给Servlet
     * @param id
     * @return 
     *  
     */
    public UserInfo selectOne(String id) {
	UserInfo user = new UserInfo();
	UserInfoDao userInfoDao = new UserInfoDao();

	if (id != null && !"".equals(id)) {
	    List<UserInfo> list = userInfoDao.selectOne(Integer.valueOf(id));
	    user.setUserId(Integer.valueOf(id));
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
	} else {
	    user.setUserId(null);
	    user.setUserName(null);
	    user.setAge(null);
	    user.setNotes(null);
	}
	return user;

    }
}
