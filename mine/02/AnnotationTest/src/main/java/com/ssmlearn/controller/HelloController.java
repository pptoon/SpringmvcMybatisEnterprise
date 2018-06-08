package com.ssmlearn.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

	private static final Log logger = LogFactory.getLog(HelloController.class);

	@RequestMapping("/hello")
	public ModelAndView hello(){
		logger.info("hello方法被调用");
		ModelAndView mv = new ModelAndView();
		System.out.println("13333");
		mv.addObject("message", "Hello World!");
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		/*mv.setViewName("content/welcome.jsp");*/
		return mv;
	}

}
