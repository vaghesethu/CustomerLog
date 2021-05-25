package com.application.log.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.application.log.customer.customer;
import com.application.log.dao.customerRepo;

@Controller
public class LogController {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@Autowired
	customerRepo repo;
	
	@RequestMapping("/checkIn")
	public String checkIn(customer user) {
		 Date d = Calendar.getInstance().getTime(); 
         Date t = Calendar.getInstance().getTime();  
         DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss ");
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");  
         String date = dateFormat.format(d);  
         String time = timeFormat.format(t);
         String id=user.getName()+time;
         user.setDate(date);
         user.setTime(time);
         user.setId(id);
		user.setLogType("IN");
		repo.save(user);
		return "checkin.jsp";
	}
	@RequestMapping("/checkOut")
	public String checkOut(customer user) {
		 Date d = Calendar.getInstance().getTime(); 
         Date t = Calendar.getInstance().getTime();  
         DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss ");
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");  
         String date = dateFormat.format(d);  
         String time = timeFormat.format(t);
         String id=user.getName()+time;
         user.setDate(date);
         user.setTime(time);
         user.setId(id);
		 user.setLogType("OUT");
		 repo.save(user);
		 return "home.jsp";
	}
	
	@RequestMapping("/getLog")
	@ResponseBody
	public String getLog(@RequestParam String date) {
		return repo.findByDate(date).toString();
	}
	
	@RequestMapping("/getAllLog")
	@ResponseBody
	public String getAllLog() {
		return repo.findAll().toString();
	}
}
