package com.songyl.weixin.service;

import java.util.List;

import com.songyl.weixin.dao.MessageDao;
import com.songyl.weixin.entity.Message;

/**
 * @author Administrator
 * ��Servlet��Ӧ��һЩ���б���ص�ҵ����
 */
public class ListService {
    /**
     * @�������� TODO     ��DAO���ѯ�����Ľ�����ظ�Servlet
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
