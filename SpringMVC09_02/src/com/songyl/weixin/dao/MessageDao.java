package com.songyl.weixin.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.songyl.weixin.db.DBAccess;
import com.songyl.weixin.entity.Message;

/**
 * @author Administrator
 * ��Message����ص����ݿ����
 */
public class MessageDao {

    /**
     * @�������� TODO           ��ѯ��Ϣ�б�
     * @param command       ָ������
     * @param description   ����
     * @return messageList    ��ѯ��Ϣ�б�Ľ������
     *  
     */
    public List<Message> queyMessageList(String command, String description) {
	DBAccess dbAccess = new DBAccess();
	List<Message> messageList = new ArrayList<Message>();
	Message message = new Message();
	SqlSession sqlSession = null;
	try {
	    sqlSession = dbAccess.getSqlSession();
	    message.setCommand(command);//��װ����ֵ
	    message.setDescription(description);
	    //ͨ��SqlSessionִ��SQL���
	    messageList = sqlSession.selectList("Message.queyMessageList", message);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} finally {
	    if (sqlSession != null) {
		sqlSession.close();
	    }
	}
	return messageList;
    }

    /**
     * @�������� TODO ɾ��������Ϣ��¼
     * @param id    Ҫɾ����Ϣ��¼������
     *  
     */
    public void deleteOne(int id) {
	DBAccess dbAccess = new DBAccess();
	SqlSession sqlSession = null;
	try {
	    sqlSession = dbAccess.getSqlSession();
	    //ͨ��SqlSessionִ��SQL���
	    sqlSession.delete("Message.deleteOne", id);
	    sqlSession.commit();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} finally {
	    if (sqlSession != null) {
		sqlSession.close();
	    }
	}
    }

    /**
     * @�������� TODO ����ɾ��������Ϣ��¼
     * @param ids  Ҫɾ����Ϣ��¼����������
     *  
     */
    public void deleteBatch(List<Integer> ids) {
	DBAccess dbAccess = new DBAccess();
	SqlSession sqlSession = null;
	try {
	    sqlSession = dbAccess.getSqlSession();
	    //ͨ��SqlSessionִ��SQL���
	    sqlSession.delete("Message.deleteBatch", ids);
	    sqlSession.commit();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} finally {
	    if (sqlSession != null) {
		sqlSession.close();
	    }
	}
    }

    public static void main(String[] args) {
	MessageDao messageDao = new MessageDao();
	messageDao.queyMessageList("1", "2");
    }
    //    public List<Message> queyMessageList(String i_command, String i_description) {
    //	Message message = null;
    //	List<Message> messageList = new ArrayList<Message>();
    //	//ͨ���������ȡ���ݿ�����
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
    //	    //����ռλ����Ӧ��ֵ
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
    //	    //ͨ��������ر����ݿ�����
    //	    DBUtils.close(rs, ps, conn);
    //	}
    //	return messageList;
    //    }

}