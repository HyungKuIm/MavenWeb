package com.oraclejava.commentstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oraclejava.commentstore.service.CommentService;
import com.oraclejava.model.Comment;

@Controller
public class CommentWriteController {
	
	@Autowired
	private CommentService service;
	
	@RequestMapping(value="/commentWrite", method=RequestMethod.POST)
	@ResponseBody 
	// content=안녕하세요&..
	public String create(@ModelAttribute Comment comment) {
		return service.put(comment);
	}
}







