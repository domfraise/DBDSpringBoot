package facade;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class LoginController {

	@RequestMapping("/sign-up")
	public String index2(Model model) {
		model.addAttribute("user", new User());
		return "sign-up";
	}  

	@RequestMapping(value="/sign-up", method=RequestMethod.POST)
	public String index2(@ModelAttribute(value = "user") User user) {
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return "sign-up";
	}  

	//    @RequestMapping("/name/{name}")
	//    public String name(@PathVariable String input){
	//        this.name = input;
	//	return "index3";
	//   }  
}
