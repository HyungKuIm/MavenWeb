package com.oraclejava.service;

import java.util.List;

import com.oraclejava.model.Blog;

public interface BlogService {
	List<Blog> selectList();
	int create(Blog blog);
	Blog read(int blogSeq);
	boolean edit(Blog blog);
}
