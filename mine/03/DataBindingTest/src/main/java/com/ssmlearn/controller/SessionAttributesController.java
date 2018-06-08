package com.ssmlearn.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.ssmlearn.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;




@Controller
@SessionAttributes("user")
public class SessionAttributesController{

	private static final Log logger = LogFactory
            .getLog(SessionAttributesController.class);
	
	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){
		return formName;
	}

	@RequestMapping(value="/login")
	 public String login(
			 @RequestParam("loginName") String loginName,
			 @RequestParam("password") String password,
			 Model model ) {
		 User user = new User();
		 user.setLoginName(loginName);
		 user.setPassword(password);
		 user.setUsername("admin");
		 model.addAttribute("user",user);
		 return "welcome";
	 }
	
	

}

