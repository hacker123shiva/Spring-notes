package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox")String query) {
	
		 
		String url="https://www.google.com/search?q="+query;;
		RedirectView redirectView=	new RedirectView();
      if(query.isBlank()) {
    	  redirectView.setUrl("home");	
		}
      else
	    redirectView.setUrl(url);
	return redirectView;
	}
	
	@RequestMapping("form")
	public String form() {
		return "complex_form";
	}
}
