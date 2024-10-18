package com.oraclejava.commentstore.service;

import java.util.List;

import com.oraclejava.model.Comment;

public interface CommentService {
	
	List<Comment> list();
	
	// 댓글 작성
	String put(Comment comment);
}
