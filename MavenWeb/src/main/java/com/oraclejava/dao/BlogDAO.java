package com.oraclejava.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oraclejava.model.Blog;

@Repository
public class BlogDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<Blog> selectList() {
		return sqlSession.selectList("BLOG.selectList");
	}
	
	public int insert(Blog blog) {
		int result = sqlSession.insert("BLOG.insert", blog);
		return result;
	}
}
