package com.songyl.webmvc.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	UserInfo user = new UserInfo();
	UserInfoDao userInfoDao = new UserInfoDao();

	if (id != null && !"".equals(id)) {
	    Pattern pattern = Pattern.compile("[0-9]*");
	    Matcher isNum = pattern.matcher(id);
	    if (!isNum.matches()) {
		user.setUserName("NONE");
		user.setAge(0);
		user.setNotes("���������֣���");
	    } else {
		int userID = Integer.valueOf(id);
		System.out.println(userID);
		List<UserInfo> list = userInfoDao.selectOne(userID);
		user.setUserId(Integer.valueOf(userID));
		if (list.isEmpty()) {
		    user.setUserName("NONE");
		    user.setAge(0);
		    user.setNotes("û�д���!!!!!");
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
}
