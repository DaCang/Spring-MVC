package com.songyl.weixin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.songyl.weixin.service.ListService;

/**
 * @author Administrator
 * 返回页面数据：Model
 *
 */
@Controller
@RequestMapping("/weixin")
public class WeixinController {

    @RequestMapping(value = "messageList")
    public String add4(HttpServletRequest request, Model model) {
	//接受页面传回的值
	String command = request.getParameter("command");
	String description = request.getParameter("description");

	//给页面设置值
	request.setAttribute("command", command);
	request.setAttribute("description", description);

	//查询消息列表，并传给页面
	ListService listService = new ListService();
	model.addAttribute("messageList", listService.queyMessageList(command, description));

	return "WEB-INF/jsp/back/messageList";
    }

}
