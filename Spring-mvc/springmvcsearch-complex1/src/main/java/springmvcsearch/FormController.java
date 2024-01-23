package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		System.out.println("Complex form handling");
		return "complex_form";
	}
/*
 using RequestParam	
 
	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	public String formHandler(@RequestParam("name")String name, @RequestParam("id")Long id)
{
		System.out.println(name);
		System.out.println(id);
   return "success";		
}

*/
	
	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("student")Student student)
{
	 System.out.println(student);
	 System.out.println(student.getName());
   return "success";		
}
}
