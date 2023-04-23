package controllers;
import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @GetMapping("/")
    public String index(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
    @PostMapping("save")
    //@ResponseBody
    public String report(@ModelAttribute("user") User user, BindingResult result, Model model){
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("user", user);
        return "response";
        //return "Name: " + user.getName() + ", Email: " + user.getEmail() + ", Password: " + user.getPassword();
    }
    // @RequestMapping(value = "/", method = RequestMethod.GET)
    // public String welcomePage() {
    //   	return "index";
    // }
    // @RequestMapping(value = "showdata", method = RequestMethod.GET)
	// public String showdata(@RequestParam(name ="username", defaultValue = "Sang1011") String name, Model model) {
	// // public String showdata(@RequestParam(name ="sSSSusername", required = false) String name, Model model) {	//This will not throw a exception
	// 	model.addAttribute("uname", name);
	// 	return "report";
	// }
}
