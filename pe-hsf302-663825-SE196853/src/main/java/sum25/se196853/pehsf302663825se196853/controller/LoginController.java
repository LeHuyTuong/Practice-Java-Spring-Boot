package sum25.se196853.pehsf302663825se196853.controller;


import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sum25.se196853.pehsf302663825se196853.model.User;
import sum25.se196853.pehsf302663825se196853.service.UserService;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String root() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(
            HttpSession session,
            @RequestParam("email") String email,
            @RequestParam("password") String password) {
        User user = userService.getUser(email, password);
        if (user == null) {
            return "redirect:/login";
        }
        session.setAttribute("user", user);
        if(user.getRole().equals("admin")){
            return "redirect:/product/list";
        }
        else{
            return "redirect:/home";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
