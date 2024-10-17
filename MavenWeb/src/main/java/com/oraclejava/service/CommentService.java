package com.oraclejava.service;

import java.util.List;

import com.oraclejava.model.BlogCmt;

public interface CommentService {
	
	BlogCmt add(BlogCmt blogCmt);
	List<BlogCmt> listByBlogSeq(int blogSeq);
}
