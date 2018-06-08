package com.ssmlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssmlearn.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Log logger = LogFactory.getLog(UserController.class);

	private static List<User> userList;

	public UserController() {
		super();
		userList = new ArrayList<User>();
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm() {
		logger.info("register get 方法被 调用");
		return "registerForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestParam("loginName") String loginName, @RequestParam("password") String password,
			@RequestParam("username") String username) {
		logger.info("register post 方法被 调用");

		User user = new User();
		user.setLoginName(loginName);
		user.setPassword(password);
		user.setUsername(username);
		userList.add(user);
		return "loginForm";
	}

	@RequestMapping("/login")
	public String login(@RequestParam("loginName") String loginName, @RequestParam("password") String password,
			Model model) {
		logger.info("登录名" + loginName + "密码" + password);
		
		for(User user : userList)
		{
			if(user.getLoginName().equals(loginName)
					&& user.getPassword().equals(password))
			{
				model.addAttribute("user", user);
				return "welcome";
			}
		}
		
		return "loginForm";
	}

}
