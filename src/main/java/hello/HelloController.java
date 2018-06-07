package src.main.java.hello;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
    public String name = "defuault";
	
	@RequestMapping("/index2")
    public String index2() {
        return "index2";
    }  
    
//    @RequestMapping("/name/{name}")
//    public String name(@PathVariable String input){
//        this.name = input;
//	return "index3";
 //   }  
}
