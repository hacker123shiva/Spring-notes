package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.entity.User;

@Controller
@RequestMapping("/service")
public class ContactController {
	
	@ModelAttribute
public void commonDataForModel(Model model) {
	model.addAttribute("Header","Shiva Srivastava");
	model.addAttribute("desc","Home Page for User");
}
	
@RequestMapping("/contact")
public String showForm(Model model) {
 
	return "contact";
}

@RequestMapping(path="/processform",method=RequestMethod.POST)
public String handleForm(@ModelAttribute User user,Model model) 
{
	System.out.println("Name of candidate is :: "+user.getName());
	System.out.println("Email of candidate is:: "+user.getEmail());
	return "success";
}
}
