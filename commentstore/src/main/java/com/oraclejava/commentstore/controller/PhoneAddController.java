package com.oraclejava.commentstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oraclejava.commentstore.service.PhoneService;
import com.oraclejava.model.Phone;

@Controller
public class PhoneAddController {
	
	@Autowired
	private PhoneService phoneService;
	
	@PostMapping("/phoneAdd")
	@ResponseBody
	public int create(@ModelAttribute Phone phone) {
		int id = phoneService.addPhone(phone);
		return id;
	}
}











