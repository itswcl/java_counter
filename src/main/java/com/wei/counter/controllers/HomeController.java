package com.wei.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		
		
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);			
		} else {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count += 1);	
		}
		
		return "index.jsp";
	}
	
	
	@RequestMapping("/counter")
	public String getCount(HttpSession session, Model model) {
		
		Integer count = (Integer) session.getAttribute("count");
		model.addAttribute("count", count);
		
		return "index.jsp";
	}
	
	@RequestMapping("/counter/addTwo")
	public String countTwo(HttpSession session) {
		
		
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);			
		} else {
			
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count += 2);	
		}
		
		return "index.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {

			session.invalidate();
//			session.removeAttribute("count");

		
		return "index.jsp";
	}
}
