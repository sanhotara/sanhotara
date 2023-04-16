package controllers;
import models.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String index(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
    @PostMapping("report")
    public String report(@ModelAttribute("user") User user, Model model){
        model.addAttribute("user", user);
        return "report";
    }
}
