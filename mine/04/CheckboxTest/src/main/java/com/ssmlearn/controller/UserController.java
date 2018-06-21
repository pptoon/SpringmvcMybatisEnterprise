package com.ssmlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssmlearn.domain.User;

@Controller 
public class UserController {

	@RequestMapping(value="/checkboxForm",method= RequestMethod.GET)
	public String registerForm(Model model ) {
		User user = new User();
		user.setReader(true);
		List<String > list = new ArrayList<String>();
		list.add("JavaEE");
		list.add("Spring");
		user.setCourses(list);
		
		model.addAttribute("user",user);
		return "checkboxForm";
		
	}
}
