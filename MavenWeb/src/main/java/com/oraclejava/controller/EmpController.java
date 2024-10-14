package com.oraclejava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.oraclejava.service.EmpService;

@Controller
public class EmpController {

	private final EmpService empService;
	
	public EmpController(EmpService empService) {
		this.empService = empService;
	}
	
	@GetMapping("/emplist")
	public String listEmp(Model model) {
		model.addAttribute("empList", empService.getEmpList());
		return "emplist";
	}
}
