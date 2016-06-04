package com.songyl.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * springע��
 *
 */
@Controller
//���ȥ��ֻ��Ϊ�˹淶��ע
@RequestMapping("/user")

public class UserController {
    @RequestMapping(value = "/list")
    public String list(String username, String userpsw, String gender, Model model) {
	System.out.println("�û�����" + username);
	System.out.println("���룺" + userpsw);
	System.out.println("�Ա�" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);
	System.out.println("++++++��ѯ�ɹ�#######");
	return "UserInfo/user_list";
    }

    @RequestMapping(value = "/add")
    public String add(String username, String userpsw, String gender, Model model) {
	System.out.println("�û�����" + username);
	System.out.println("���룺" + userpsw);
	System.out.println("�Ա�" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);
	System.out.println("++++++��ӳɹ�#######");
	return "UserInfo/user_add";
    }

    @RequestMapping(value = "/update")
    public String update(String username, String userpsw, String gender, Model model) {
	System.out.println("�û�����" + username);
	System.out.println("���룺" + userpsw);
	System.out.println("�Ա�" + gender);

	model.addAttribute("username", username);
	model.addAttribute("gender", gender);
	System.out.println("++++++�޸ĳɹ�#######");
	return "UserInfo/user_update";
    }

}
