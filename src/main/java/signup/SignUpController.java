package signup;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignUpController {

	@RequestMapping("/sign-up")
	public String signUp(Model model) {
		model.addAttribute("user", new User());
		return "sign-up";
	}  

	@RequestMapping(value="/sign-up", method=RequestMethod.POST)
	public String createUser(@ModelAttribute(value = "user") User user) {
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return "sign-up";
	}  

	//    @RequestMapping("/email/{email}")
	//    public String email(@PathVariable String input){
	//        this.email = input;
	//	return "index3";
	//   }  
}
