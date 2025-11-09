package fa25.se196853.controller;

import fa25.se196853.entity.Account;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

        @GetMapping("/home")
        public String home(HttpSession session) {
            Account account = (Account) session.getAttribute("user");
            if (account == null) {
                return "redirect:/login";
            }else if(account.getRole().equals("Admin") || account.getRole().equals("Staff")){
                return "redirect:/rice/list";
            }
            else{
                return "redirect:/home";
            }
        }

        @GetMapping("/errorPage")
        public String accessDeniedPage(){
            return "errorPage";
        }
}
