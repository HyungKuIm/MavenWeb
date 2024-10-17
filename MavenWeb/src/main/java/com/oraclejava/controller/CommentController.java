package com.oraclejava.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/list")
	@ResponseBody
	public List<BlogCmt> listByBlogSeq(int blogSeq) {
		return this.commentService.listByBlogSeq(blogSeq);
	}
	
}






