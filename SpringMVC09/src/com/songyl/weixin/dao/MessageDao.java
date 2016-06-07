package com.songyl.weixin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.songyl.weixin.entity.Message;

/**
 * @author Administrator
 * 和Message表相关的数据库操作
 */
public class MessageDao {

    /**
     * @方法描述 TODO           查询信息列表
     * @param i_command       指令名称
     * @param i_description   描述
     * @return messageList    查询信息列表的结果集合
     *  
     */
    public List<Message> queyMessageList(String i_command, String i_description) {
	Message message = null;
	List<Message> messageList = new ArrayList<Message>();
	//通过工具类获取数据库连接
	Connection conn = DBUtils.getConnection();
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
	    StringBuilder sql = new StringBuilder("select * from message where 1=1 ");
	    List<String> paramList = new ArrayList<String>();
	    if (i_command != null && !"".equals(i_command.trim())) {
		sql.append("and command=? ");
		paramList.add(i_command);
	    }
	    if (i_description != null && !"".equals(i_description.trim())) {
		sql.append("and description like '%' ? '%'");
		paramList.add(i_description);
	    }
	    ps = conn.prepareStatement(sql.toString());
	    for (int i = 0; i < paramList.size(); i++) {
		ps.setString(i + 1, paramList.get(i));
	    }
	    //设置占位符对应的值
	    rs = ps.executeQuery();
	    while (rs.next()) {
		String id = rs.getString("id");
		String command = rs.getString("command");
		String description = rs.getString("description");
		String content = rs.getString("content");
		System.out.println();
		message = new Message(id, command, description, content);

		messageList.add(message);
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    //通过工具类关闭数据库连接
	    DBUtils.close(rs, ps, conn);
	}
	return messageList;
    }

}