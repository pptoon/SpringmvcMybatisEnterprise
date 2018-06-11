package com.ssmlearn.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.ssmlearn.domain.Book;

@Controller
@RequestMapping("/json")
public class BookController {
	private static final Log logger = LogFactory.getLog(BookController.class);
    @RequestMapping("/testRequestBody")
	public void setJson(@RequestBody Book book, HttpServletResponse response) throws Exception {
			logger.info(JSONObject.toJSONString(book));
			book.setAuthor("裴擒虎");
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println(JSONObject.toJSONString(book));
	}
}
