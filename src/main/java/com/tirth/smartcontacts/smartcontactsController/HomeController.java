package com.tirth.smartcontacts.smartcontactsController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/homePage")
	public String homePage(Model model) {
		model.addAttribute("title","Home-Smart Contacts Manager");
		return "home";
	}
	@RequestMapping("/aboutPage")
	public String aboutPage(Model model) {
		model.addAttribute("title","About-Smart Contacts Manager");
		return "about";
	}
}
