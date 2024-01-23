package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("this is one handler");
		return "redirect:/two";
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is two handler");
		return "contact";
	}
	@RequestMapping("/three")
	public RedirectView three() {
		System.out.println("this is one handler");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("four");
		return redirectView;
	}
	
	@RequestMapping("/four")
	public String four() {
		System.out.println("this is two handler");
		return "contact";
	}	
	
	@RequestMapping("/five")
	public void five(HttpServletResponse response) throws IOException {
	    response.sendRedirect("contact");
	}

	
}
