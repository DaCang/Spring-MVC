package com.songyl.weixin.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.songyl.weixin.db.DBAccess;
import com.songyl.weixin.entity.Message;

/**
 * @author Administrator
 * 和Message表相关的数据库操作
 */
public class MessageDao {

    /**
     * @方法描述 TODO           查询信息列表
     * @param command       指令名称
     * @param description   描述
     * @return messageList    查询信息列表的结果集合
     *  
     */
    public List<Message> queyMessageList(String command, String description) {
	DBAccess dbAccess = new DBAccess();
	List<Message> messageList = new ArrayList<Message>();
	Message message = new Message();
	SqlSession sqlSession = null;
	try {
	    sqlSession = dbAccess.getSqlSession();
	    message.setCommand(command);//封装属性值
	    message.setDescription(description);
	    //通过SqlSession执行SQL语句
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
     * @方法描述 TODO 删除单条信息记录
     * @param id    要删除信息记录的主键
     *  
     */
    public void deleteOne(int id) {
	DBAccess dbAccess = new DBAccess();
	SqlSession sqlSession = null;
	try {
	    sqlSession = dbAccess.getSqlSession();
	    //通过SqlSession执行SQL语句
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
     * @方法描述 TODO 批量删除多条信息记录
     * @param ids  要删除信息记录的主键集合
     *  
     */
    public void deleteBatch(List<Integer> ids) {
	DBAccess dbAccess = new DBAccess();
	SqlSession sqlSession = null;
	try {
	    sqlSession = dbAccess.getSqlSession();
	    //通过SqlSession执行SQL语句
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