package org.my.prj.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome(Model model){
		model.addAttribute("name", "swkim");
		model.addAttribute("age", 37);
		model.addAttribute("email", "noriiron@naver.com");
		return "welcome";
	}
	
}
