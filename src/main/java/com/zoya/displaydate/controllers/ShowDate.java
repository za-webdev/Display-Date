package com.zoya.displaydate.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

	
	@RequestMapping("/")
	@Controller
	public class ShowDate{
		@RequestMapping("")
		public String home() {
			return "index";
		}
		
		@RequestMapping("/dateinfo")
		public String showDate(Model model ) {
			System.out.println("hellooo");
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("EEEE 'the' dd 'of' MMM yyy ");
		model.addAttribute("date",dateFormat.format(date));
			return "date";
		}
		
		@RequestMapping("/timeinfo")
		public String showTime(Model model) {
			Date date = new Date();
			DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
			model.addAttribute("time",dateFormat.format(date));
			return "time";
		}
		

		
	}


