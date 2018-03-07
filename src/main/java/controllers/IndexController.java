package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model m){
        m.addAttribute("ctrlParam", "Hello from index controller");

        return "index";
    }
}
