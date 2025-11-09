package fa25.se196853.controller;

import fa25.se196853.entity.Account;
import fa25.se196853.service.AccountService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private AccountService accountService;

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
        Account account = accountService.getAccount(email, password);
        if (account == null) {
            return "redirect:/login";
        }
        session.setAttribute("account", account);
        if(account.getRole().equals("Admin") || account.getRole().equals("Staff")){
            return "redirect:/rice/list";
        }
        else{
            return "redirect:/errorPage";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
