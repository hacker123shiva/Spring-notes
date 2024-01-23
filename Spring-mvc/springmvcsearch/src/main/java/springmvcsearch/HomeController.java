package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/nameSearch")
	public String nameSearch() {
		return "input";
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("name") String name,Model m) {
		m.addAttribute("name",name);
		return "welcome";
	}
	
}
