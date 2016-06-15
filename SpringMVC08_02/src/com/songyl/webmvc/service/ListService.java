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

	UserInfoDao userInfoDao = new UserInfoDao();
	UserInfo userInfo = new UserInfo();

	List<UserInfo> list = userInfoDao.selectOne(Integer.valueOf(id));
	if (list.isEmpty()) {
	    userInfo.setUserId(Integer.valueOf(id));
	    userInfo.setUserName("NONE");
	    userInfo.setAge(0);
	    userInfo.setNotes("没有此人!!!!!");
	} else {
	    userInfo = list.get(0);

	}
	return userInfo;

    }
}
