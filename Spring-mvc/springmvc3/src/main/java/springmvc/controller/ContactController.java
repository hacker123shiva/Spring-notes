package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/service")
public class ContactController {
	
@RequestMapping("/contact")
public String showForm() {
	return "contact";
}

@RequestMapping(path="/processform",method=RequestMethod.POST)
public String handleForm(HttpServletRequest request) {
	String email=request.getParameter("name");
	String name=request.getParameter("email");
	
	System.out.println("Name of candidate is :: "+name);
	System.out.println("Email of candidate is:: "+email);
	return "";
}
}
