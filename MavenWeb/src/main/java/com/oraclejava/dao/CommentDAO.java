package com.oraclejava.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oraclejava.model.BlogCmt;

@Repository
public class CommentDAO {
	@Autowired
	SqlSession sqlSession;
	
	public int insert(BlogCmt blogCmt) {
		return sqlSession.insert("BLOG_CMT.insert", blogCmt);
	}
}
