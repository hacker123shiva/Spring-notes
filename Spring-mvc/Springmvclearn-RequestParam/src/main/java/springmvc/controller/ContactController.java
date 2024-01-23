package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/service")
public class ContactController {
	
@RequestMapping("/contact")
public String showForm() {
	return "contact";
}

@RequestMapping(path="/processform",method=RequestMethod.POST)
public String handleForm(@RequestParam("name")String name, 
		@RequestParam("email") String email,
		@RequestParam("password")String password, Model model) {
	model.addAttribute("name",name);
	model.addAttribute("email",email);
	System.out.println("Name of candidate is :: "+name);
	System.out.println("Email of candidate is:: "+email);
	return "success";
}
}
