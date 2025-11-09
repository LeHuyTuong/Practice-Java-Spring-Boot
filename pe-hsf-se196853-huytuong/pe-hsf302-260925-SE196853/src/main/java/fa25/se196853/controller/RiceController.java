package fa25.se196853.controller;

import fa25.se196853.entity.Account;
import fa25.se196853.entity.Rice;
import fa25.se196853.entity.Supply;
import fa25.se196853.service.AccountService;
import fa25.se196853.service.RiceService;
import fa25.se196853.service.SupplyService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RiceController {
    @Autowired
    private RiceService riceService;

    @Autowired
    private SupplyService supplyService;

    @Autowired
    private AccountService accountService;

    @GetMapping("/rice/list")
    public String productList(
            Model mov,
            HttpSession session
        ){
        Account account = (Account)session.getAttribute("account");
        List<Rice> rice = riceService.getAllRice();
        mov.addAttribute("rices", rice);
        mov.addAttribute("account", account);
        return "rice/list";
    }

    @GetMapping("/rice/create")
        public String showCreateForm(
                Model mov,
                HttpSession session
        ){
            Account account = (Account)session.getAttribute("account");
            if(account.getRole().equals("Admin")){
                return "redirect:/rice/create";
            }else if(account.getRole().equals("Member") || account.getRole().equals("Staff")){
                return "redirect:/rice/list";
            }
            List<Supply> supplies = supplyService.getSupplies();
            mov.addAttribute("rice", new Rice());
            mov.addAttribute("supplies", supplies);
            return "rice/create";
        }
}
