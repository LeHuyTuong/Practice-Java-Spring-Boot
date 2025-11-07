package pe_hsf302_trialexam_SE196853.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pe_hsf302_trialexam_SE196853.model.User;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }else if(user.getRole().equals("ADMIN")){
            return "redirect:/product";
        }
        else{
            return "redirect:/home";
        }
    }

    @GetMapping("/403")
    public String accessDeniedPage(){
        return "403";
    }
}
