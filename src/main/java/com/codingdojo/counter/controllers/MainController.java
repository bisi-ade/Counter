package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer count;
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			count = (Integer)session.getAttribute("count");
		} else {
			count = (Integer)session.getAttribute("count");
		}
		count++;
		session.setAttribute("count", count);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer count;
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			count = (Integer)session.getAttribute("count");
		} else {
			count = (Integer)session.getAttribute("count");
		}
		model.addAttribute("count", count);
		return "counter.jsp";
	}
	
	@RequestMapping("/counter2")
	public String addTwo(HttpSession session, Model model) {
		Integer count;
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			count = (Integer)session.getAttribute("count");
		} else {
			count = (Integer)session.getAttribute("count");
		}
		count += 2;
		session.setAttribute("count", count);
		model.addAttribute("count", count);
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", null);
		return "index.jsp";
	}

}
