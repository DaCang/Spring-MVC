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
 * ��Message����ص����ݿ����
 */
public class MessageDao {

    /**
     * @�������� TODO           ��ѯ��Ϣ�б�
     * @param i_command       ָ������
     * @param i_description   ����
     * @return messageList    ��ѯ��Ϣ�б�Ľ������
     *  
     */
    public List<Message> queyMessageList(String i_command, String i_description) {
	Message message = null;
	List<Message> messageList = new ArrayList<Message>();
	//ͨ���������ȡ���ݿ�����
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
	    //����ռλ����Ӧ��ֵ
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
	    //ͨ��������ر����ݿ�����
	    DBUtils.close(rs, ps, conn);
	}
	return messageList;
    }

}