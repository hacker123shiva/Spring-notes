package springmvcsearch;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//@Controller
//public class ConveyValue {
//	
//	@RequestMapping("/first")
//	public String first(RedirectAttributes redAttr) {
//		redAttr.addFlashAttribute("convey", "I am Shiva");
//		System.out.println("first handler method");
//		return "redirect:/second";
//	}
//
//	@RequestMapping("/second")
//	public String Second(Model model) {
//		System.out.println("Second handler method");
//		// Retrieve the flash attribute set in the first method
//		String convey = (String) model.asMap().get("convey");
//		model.addAttribute("convey", convey);
//		return "show";
//	}
//}

//@Controller
//public class ConveyValue {
//    
//    @RequestMapping("/first")
//    public String first(RedirectAttributes redAttr ) {
//        redAttr.addFlashAttribute("convey", "I am Shiva");
//        System.out.println("first handler method");
//        return "redirect:/second";
//    }
//
//    @RequestMapping("/second")
//    public String Second(@ModelAttribute("convey") String convey , Model model) {
//        System.out.println("Second handler method");
//        
//        // 'convey' now contains the value from the flash attribute
//        System.out.println("Value retrieved in Second method: " + convey);
//
//        return "show";
//    }
//}

@Controller
@SessionAttributes("user")
public class ConveyValue {
    
    @RequestMapping("/first")
    public String first(RedirectAttributes redAttr, Model model ) {
    	model.addAttribute("user", "Shiva");
    	 
        redAttr.addFlashAttribute("convey", "I am Shiva");
        System.out.println("first handler method");
        return "redirect:/second";
    }

    @RequestMapping("/second")
    public String Second(@ModelAttribute("convey") String convey , @ModelAttribute("user") String  user, @ModelAttribute("anime") String  anime, Model model) {
        System.out.println("Second handler method");
        
        // 'convey' now contains the value from the flash attribute
        System.out.println("Value retrieved in Second method: " + convey);
        System.out.println("User is "+user);

        return "redirect:/third";
    }


@RequestMapping("/third")
public String Third(@ModelAttribute("convey") String convey  ,HttpSession session,  Model model) {
    System.out.println("Third handler method");
    
    // 'convey' now contains the value from the flash attribute
    System.out.println("Value retrieved in Third method: " + convey);
    String user=(String)session.getAttribute("user");
    System.out.println("User in third method is "+user);

    return "redirect:/third";
}
}
 


 
