package com.songyl.weixin.service;

import java.util.ArrayList;
import java.util.List;

import com.songyl.weixin.dao.MessageDao;

/**
 * @author Administrator
 * ά��ҵ����صĹ���
 */
public class MaintainService {

    /**
     * @�������� TODO ɾ��������Ϣ��¼
     * @param id    Ҫɾ����Ϣ��¼������
     *  
     */
    public void deleteOne(String id) {
	if (id != null && !"".equals(id.trim())) {
	    MessageDao messageDao = new MessageDao();
	    messageDao.deleteOne(Integer.valueOf(id));
	}

    }

    /**
     * @�������� TODO ����ɾ��������Ϣ��¼
     * @param ids  Ҫɾ����Ϣ��¼����������
     *  
     */
    public void deleteBatch(String[] ids) {
	MessageDao messageDao = new MessageDao();
	List<Integer> idList = new ArrayList<Integer>();
	for (String id : ids) {
	    idList.add(Integer.valueOf(id));
	}
	messageDao.deleteBatch(idList);
    }

}
