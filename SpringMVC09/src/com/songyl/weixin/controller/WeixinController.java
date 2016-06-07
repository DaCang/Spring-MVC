package com.songyl.weixin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.songyl.weixin.service.ListService;

/**
 * @author Administrator
 * ����ҳ�����ݣ�Model
 *
 */
@Controller
@RequestMapping("/weixin")
public class WeixinController {

    @RequestMapping(value = "messageList")
    public String add4(HttpServletRequest request, Model model) {
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

}
