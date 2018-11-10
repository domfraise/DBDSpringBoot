package facade;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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

	@GetMapping("/.well-known/acme-challenge/8Dpcj4BzeeLC0-x6Om-vUQC09-v92xqQv-Ba0-qaUR8")
    public void verify1(HttpServletResponse response) throws IOException {
        FileCopyUtils.copy(new FileInputStream(new File("src/main/resources/8Dpcj4BzeeLC0-x6Om-vUQC09-v92xqQv-Ba0-qaUR8")),
                response.getOutputStream());
    }

	@GetMapping("/.well-known/acme-challenge/mtzXPwnDpIeFbmjBjkop8hr6G_J4hDwoyZ5BPxf9uu0")
    public void verify2(HttpServletResponse response) throws IOException {
        FileCopyUtils.copy(new FileInputStream(new File("src/main/resources/mtzXPwnDpIeFbmjBjkop8hr6G_J4hDwoyZ5BPxf9uu0")),
                response.getOutputStream());
    }
}
