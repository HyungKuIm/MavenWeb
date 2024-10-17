package com.oraclejava.service;

import java.util.List;

import com.oraclejava.model.Blog;
import com.oraclejava.model.Pagination;

public interface BlogService {
	List<Blog> selectList(Pagination pagination);
	int create(Blog blog);
	Blog read(int blogSeq);
	boolean edit(Blog blog);
	boolean delete(int blogSeq);
}
