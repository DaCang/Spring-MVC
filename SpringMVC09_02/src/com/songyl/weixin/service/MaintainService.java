package com.songyl.weixin.service;

import java.util.ArrayList;
import java.util.List;

import com.songyl.weixin.dao.MessageDao;

/**
 * @author Administrator
 * 维护业务相关的功能
 */
public class MaintainService {

    /**
     * @方法描述 TODO 删除单条信息记录
     * @param id    要删除信息记录的主键
     *  
     */
    public void deleteOne(String id) {
	if (id != null && !"".equals(id.trim())) {
	    MessageDao messageDao = new MessageDao();
	    messageDao.deleteOne(Integer.valueOf(id));
	}

    }

    /**
     * @方法描述 TODO 批量删除多条信息记录
     * @param ids  要删除信息记录的主键集合
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
