package com.oraclejava.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oraclejava.model.Employee;

@Repository
public class EmployeeDAO {

	private final SqlSession session;
	
	public EmployeeDAO(SqlSession session) {
		this.session = session;
	}
	
	public List<Employee> selectList() {
		List<Employee> list = 
				session.selectList("employee.selectList");
		return list;
	}
}
