package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// @RequestMapping("/hello")
public class HelloController
{
    // @RequestMapping(method = RequestMethod.GET)
    // public String viewHello(ModelMap model){
    //     model.addAttribute("message","Welcome to Spring MVC journey!");
    //     return "hello";
    // }
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcomePage() {
      	return "user-form";
    }

    // @RequestMapping(value = "/userform", method = RequestMethod.GET)
	// public String showForm() {
	// 	return "user-form";
	// }	

	// @RequestMapping(value = "showdata", method = RequestMethod.GET)
	// public String showdata() {
	// 	return "user-data";
	// }
	@RequestMapping(value = "showdata", method = RequestMethod.GET)
	public String showdata(@RequestParam(name ="username", defaultValue = "Sang1011") String name, Model model) {
	// public String showdata(@RequestParam(name ="sSSSusername", required = false) String name, Model model) {	//This will not throw a exception
		model.addAttribute("uname", name);
		return "user-data";
	}
}