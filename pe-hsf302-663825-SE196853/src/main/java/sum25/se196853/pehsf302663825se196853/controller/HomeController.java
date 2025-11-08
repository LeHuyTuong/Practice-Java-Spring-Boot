package sum25.se196853.pehsf302663825se196853.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sum25.se196853.pehsf302663825se196853.model.User;

@Controller
public class HomeController {
        @GetMapping("/home")
            public String home(HttpSession session) {
                User user = (User) session.getAttribute("user");
                if(user == null) {
                    return "redirect:/login";
                }else if(user.getRole().equals("admin")) {
                    return "redirect:/user/list";
                }else{
                    return "home";
                }
            }

            @GetMapping("/403")
            public String accessDenied() {
                return "403";

            }
}
