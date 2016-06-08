package com.songyl.weixin.service;

import java.util.List;

import com.songyl.weixin.dao.MessageDao;
import com.songyl.weixin.entity.Message;

/**
 * @author Administrator
 * 跟Servlet对应，一些与列表相关的业务功能
 */
public class ListService {
    /**
     * @方法描述 TODO     把DAO层查询出来的结果返回给Servlet
     * @param  command
     * @param  description
     * @return 
     *  
     */
    public List<Message> queyMessageList(String command, String description) {

	MessageDao messageDao = new MessageDao();

	return messageDao.queyMessageList(command, description);

    }
}
