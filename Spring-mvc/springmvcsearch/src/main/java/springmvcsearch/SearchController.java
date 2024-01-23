package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId,@PathVariable("userName") String userName ,Model model) {
		model.addAttribute("userId",userId);
		model.addAttribute("userName",userName);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home");
		String str=null;
//		int []ar=new int[1];
//		ar[0]=1;
//		ar[1]=2;
		System.out.println(str.length());
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
	
//	Handling the exception
	/* Use When no centralized Exception handler used for these exception
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg", "Null Pointer exception has occured");
		return "null_page";
	}
	
	
	@ExceptionHandler(value=ArrayIndexOutOfBoundsException.class)
	public String exceptionHandlerArrayIndexOutBound(Model m) {
		m.addAttribute("msg", "ArrayIndex out of bound Exception");
		return "null_page";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandleGeneric(Model m) {
		m.addAttribute("msg", " Some Exception");
		return "null_page";
	}
	*/
}

