package com.oraclejava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraclejava.dao.BlogDAO;
import com.oraclejava.model.Blog;
import com.oraclejava.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	BlogDAO blogDAO;
	
	@Override
	public List<Blog> selectList() {
		return blogDAO.selectList();
	}
	
	@Override
	public int create(Blog blog) {
		int seq = blogDAO.insert(blog);
		return seq;
	}
	
	@Override
	public Blog read(int blogSeq) {
		Blog blog = blogDAO.selectOne(blogSeq);
		return blog;
	}

	@Override
	public boolean edit(Blog blog) {
		int result = blogDAO.update(blog);
		return result > 0;
	}

}






