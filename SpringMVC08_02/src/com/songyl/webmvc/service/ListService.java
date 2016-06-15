package com.songyl.webmvc.service;

import java.util.List;

import com.songyl.webmvc.dao.UserInfoDao;
import com.songyl.webmvc.entity.UserInfo;

/**
 * @author Administrator
 * ��Servlet��Ӧ��һЩ��userinfo�б���ص�ҵ����
 */
public class ListService {

    /**
     * @�������� TODO  ��DAO���ѯ�����Ľ�����ظ�Servlet
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
	    userInfo.setNotes("û�д���!!!!!");
	} else {
	    userInfo = list.get(0);

	}
	return userInfo;

    }
}
