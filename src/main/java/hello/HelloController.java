package src.main.java.hello;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HelloController {

	@RequestMapping("/index2")
	public String index2(Model model) {
		model.addAttribute("user", new User());
		return "index2";
	}  

	@RequestMapping(value="/index2", method=RequestMethod.POST)
	public String index2(@ModelAttribute(value = "user") User user) {
		System.out.println(user.name);
		return "index2";
	}  

	//    @RequestMapping("/name/{name}")
	//    public String name(@PathVariable String input){
	//        this.name = input;
	//	return "index3";
	//   }  
}
