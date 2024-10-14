package com.oraclejava.controller;

import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NowController {
	
	private Logger logger = LoggerFactory.getLogger(NowController.class);
	
	@RequestMapping(value="/now", method=RequestMethod.GET)
	public String nowNow(Model model) {
		Date now = Calendar.getInstance().getTime();
		model.addAttribute("msg", now.toString());
		
		return "now";
	}
}
