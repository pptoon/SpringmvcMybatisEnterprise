package com.ssmlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssmlearn.domain.User;

@Controller
public class UserController {
	 @RequestMapping(value="/registerForm",method=RequestMethod.GET)
	 public String registerForm(Model model) {
		 User user = new User("jack","男",28);
		 // model中添加属性command，值是user对象
    	 model.addAttribute("command",user);
	     return "registerForm";
	 }
	 
	 @RequestMapping(value="/registerForm2",method=RequestMethod.GET)
	 public String registerForm2(Model model) {
		 User user = new User("jack","男",28);
		 // model中添加属性user，值是user对象
    	 model.addAttribute("user",user);
	     return "registerForm2";
	 }
}
