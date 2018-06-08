package com.ssmlearn.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssmlearn.domain.User;

@Controller
public class User1Controller {
	private static final Log logger = LogFactory.getLog(User1Controller.class);
	
	@ModelAttribute
	public void userModel(String loginName,String password,Model model )
	{
		logger.info("userModel");
		User user = new User();
		user.setLoginName(loginName);
		user.setPassword(password);
		model.addAttribute("user",user);
	}
	
	@RequestMapping(value="/login1")
	public String login(Model model )
	{
		logger.info("login");
		User user = (User)model.asMap().get("user");
		System.out.println(user);
		user.setUsername("测试");
		return "result1";
	}

}
