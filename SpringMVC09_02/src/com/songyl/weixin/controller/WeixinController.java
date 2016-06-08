package com.songyl.weixin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.songyl.weixin.service.ListService;
import com.songyl.weixin.service.MaintainService;

/**
 * @author Administrator
 * ����ҳ�����ݣ�Model
 *
 */
@Controller
@RequestMapping("/weixin")
public class WeixinController {

    @RequestMapping(value = "/messageList")
    public String messageList(HttpServletRequest request, Model model) {
	//����ҳ�洫�ص�ֵ
	String command = request.getParameter("command");
	String description = request.getParameter("description");

	//��ҳ������ֵ
	request.setAttribute("command", command);
	request.setAttribute("description", description);

	//��ѯ��Ϣ�б�������ҳ��
	ListService listService = new ListService();
	model.addAttribute("messageList", listService.queyMessageList(command, description));

	return "WEB-INF/jsp/back/messageList";
    }

    @RequestMapping(value = "/messageDeleteOne")
    public String messageDeleteOne(HttpServletRequest request, HttpServletResponse response, Model model)
	    throws ServletException, IOException {
	//����ҳ�洫�ص�ֵ
	String id = request.getParameter("id");
	MaintainService maintainService = new MaintainService();
	maintainService.deleteOne(id);

	request.getRequestDispatcher("/weixin/messageList.do").forward(request, response);

	return "WEB-INF/jsp/back/messageList";

    }

    @RequestMapping(value = "/messageDeleteBatch")
    public String messageDeleteBatch(HttpServletRequest request, HttpServletResponse response, Model model)
	    throws ServletException, IOException {
	//����ҳ�洫�ص�ֵ
	String[] ids = request.getParameterValues("id");
	MaintainService maintainService = new MaintainService();
	maintainService.deleteBatch(ids);

	request.getRequestDispatcher("/weixin/messageList.do").forward(request, response);

	return "WEB-INF/jsp/back/messageList";

    }
}
