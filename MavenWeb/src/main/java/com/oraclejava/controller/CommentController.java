package com.oraclejava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oraclejava.model.BlogCmt;
import com.oraclejava.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {

	private final CommentService commentService;

	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}
	
	@PostMapping("/add")
	@ResponseBody
	public BlogCmt add(BlogCmt blogCmt) {
		return this.commentService.add(blogCmt);
	}
	
}






