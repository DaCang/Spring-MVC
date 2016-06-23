package com.songyl.webmvc.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.songyl.webmvc.db.DBAccess;
import com.songyl.webmvc.entity.UserInfo;

/**
 * @author Administrator
 * 和Message表相关的数据库操作
 */
public class UserInfoDao {

    /**
     * @方法描述 TODO   查询信息列表
     * @param id      
     * @return  userInfoList  查询信息列表的结果集合
     *  
     */
    public List<UserInfo> selectOne(int id) {
	DBAccess dbAccess = new DBAccess();
	UserInfo userInfo = new UserInfo();
	List<UserInfo> userInfoList = new ArrayList<UserInfo>();
	//UserInfo userInfo = new UserInfo();
	SqlSession sqlSession = null;
	try {
	    sqlSession = dbAccess.getSqlSession();
	    //通过SqlSession执行SQL语句
	    userInfo.setUserId(id);
	    userInfoList = sqlSession.selectList("UserInfo.selectOne", userInfo);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} finally {
	    if (sqlSession != null) {
		sqlSession.close();
	    }
	}
	return userInfoList;
    }

    public static void main(String[] args) {
	UserInfoDao userInfoDao = new UserInfoDao();

	List<UserInfo> list = userInfoDao.selectOne(507);

	UserInfo userInfo = list.get(0);

	System.out.println(userInfo.getUserId());
	System.out.println(userInfo.getUserName());
	System.out.println(userInfo.getAge());

    }
    //    public List<Message> queyMessageList(String i_command, String i_description) {
    //	Message message = null;
    //	List<Message> messageList = new ArrayList<Message>();
    //	//通过工具类获取数据库连接
    //	Connection conn = DBUtils.getConnection();
    //	PreparedStatement ps = null;
    //	ResultSet rs = null;
    //	try {
    //	    StringBuilder sql = new StringBuilder("select * from message where 1=1 ");
    //	    List<String> paramList = new ArrayList<String>();
    //	    if (i_command != null && !"".equals(i_command.trim())) {
    //		sql.append("and command=? ");
    //		paramList.add(i_command);
    //	    }
    //	    if (i_description != null && !"".equals(i_description.trim())) {
    //		sql.append("and description like '%' ? '%'");
    //		paramList.add(i_description);
    //	    }
    //	    ps = conn.prepareStatement(sql.toString());
    //	    for (int i = 0; i < paramList.size(); i++) {
    //		ps.setString(i + 1, paramList.get(i));
    //	    }
    //	    //设置占位符对应的值
    //	    rs = ps.executeQuery();
    //	    while (rs.next()) {
    //		String id = rs.getString("id");
    //		String command = rs.getString("command");
    //		String description = rs.getString("description");
    //		String content = rs.getString("content");
    //		System.out.println();
    //		message = new Message(id, command, description, content);
    //
    //		messageList.add(message);
    //	    }
    //	} catch (SQLException e) {
    //	    e.printStackTrace();
    //	} finally {
    //	    //通过工具类关闭数据库连接
    //	    DBUtils.close(rs, ps, conn);
    //	}
    //	return messageList;
    //    }

}