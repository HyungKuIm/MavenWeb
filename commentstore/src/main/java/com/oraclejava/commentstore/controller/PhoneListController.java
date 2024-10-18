package com.oraclejava.commentstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oraclejava.commentstore.service.PhoneService;
import com.oraclejava.model.Phone;

@RestController
public class PhoneListController {

	@Autowired
	private PhoneService phoneService;
	
	@GetMapping("/phones")
	public List<Phone> getPhones() {
		return phoneService.listPhone();
	}
}
