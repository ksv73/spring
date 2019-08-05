package com.cgi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HiController {
	
	@RequestMapping("/hi") 
	public String message(Model model)
	{
		model.addAttribute("message", "And its a WRAP!!!!");
		return "hi";
	}
}
