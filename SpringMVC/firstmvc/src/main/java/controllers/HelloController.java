package controllers;

import org.springframework.stereotype.Controller;
// import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// @RequestMapping("/hello")
public class HelloController
{
    // @RequestMapping(method = RequestMethod.GET)
    // public String viewHello(ModelMap model){
    //     model.addAttribute("message","Welcome to Spring MVC journey!");
    //     return "hello";
    // }
    @RequestMapping(value = "userform", method = RequestMethod.GET)
	public String showForm() {
		return "user-form";
	}	

	@RequestMapping(value = "showdata", method = RequestMethod.GET)
	public String showdata() {
		return "user-data";
	}
}