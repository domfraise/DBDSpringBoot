package src.main.java.hello;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import model.*;
@Controller
public class HelloController {

	@RequestMapping("/index2")
	public String index2() {
		return "index2";
	}  

	@RequestMapping(value="/index2", method=RequestMethod.POST)
	public String index2(@ModelAttribute("user") User user) {
		System.out.println(user.name);
		return "index2";
	}  

	//    @RequestMapping("/name/{name}")
	//    public String name(@PathVariable String input){
	//        this.name = input;
	//	return "index3";
	//   }  
}
