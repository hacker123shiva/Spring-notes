package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	//provide name of view run when we enter /home
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("Home URL Running");
		model.addAttribute("name", "Shiva Srivastava");
		model.addAttribute("id",1234);
		List<String> friends =new ArrayList<String>();
		friends.add("Harsh");
		friends.add("arjun");
		friends.add("abhimanyu");
		model.addAttribute("friends",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("About URL Running");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help content page");
		//creating model and view data
	    ModelAndView modelAndView=new ModelAndView();
	    modelAndView.addObject("name","Rustom");
	    modelAndView.setViewName("help");
	    return modelAndView;
	}
}
