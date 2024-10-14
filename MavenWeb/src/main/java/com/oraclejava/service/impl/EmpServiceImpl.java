package com.oraclejava.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oraclejava.dao.EmployeeDAO;
import com.oraclejava.model.Employee;
import com.oraclejava.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	private final EmployeeDAO empDAO;
	
	public EmpServiceImpl(EmployeeDAO empDAO) {
		this.empDAO = empDAO;
	}
	

	@Override
	public List<Employee> getEmpList() {
		return empDAO.selectList();
	}

}
