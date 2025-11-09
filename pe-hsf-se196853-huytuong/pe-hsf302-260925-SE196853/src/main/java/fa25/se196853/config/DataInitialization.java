package fa25.se196853.config;

import fa25.se196853.entity.Account;
import fa25.se196853.entity.Rice;
import fa25.se196853.entity.Supply;
import fa25.se196853.service.AccountService;
import fa25.se196853.service.RiceService;
import fa25.se196853.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class DataInitialization implements CommandLineRunner {

    @Autowired
    private AccountService accountService;

    @Autowired
    private RiceService riceService;

    @Autowired
    private SupplyService supplyService;

    @Override
    public void run(String... args) throws Exception {
        Account account = new Account();
        account.setEmail("admin@ricestore.com");
        account.setPassword("@1");
        account.setRole("Admin");
        accountService.createAccount(account);

        Account account2 = new Account();
        account2.setEmail("staff@ricestore.com");
        account2.setPassword("@2");
        account2.setRole("Staff");
        accountService.createAccount(account2);

        Account account3 = new Account();
        account3.setEmail("member@ricestore.com");
        account3.setPassword("@3");
        account3.setRole("Member");
        accountService.createAccount(account3);

        Supply supply = new Supply();
        supply.setSupplierName("Golden Rice Traders");
        supply.setContactPhone("+1-555-0101");
        supply.setEmail("contact@goldenrice.com");
        supplyService.createSupply(supply);

        Supply supply2 = new Supply();
        supply2.setSupplierName("Premium Grains Ltd");
        supply2.setContactPhone("+1-555-0202");
        supply2.setEmail("sales@premiumgrains.com");
        supplyService.createSupply(supply2);

        Supply supply3 = new Supply();
        supply3.setSupplierName("Asia Rice Solutions Inc");
        supply3.setContactPhone("+1-555-0303");
        supply3.setEmail("info@asiarice.com");
        supplyService.createSupply(supply3);

        Supply supply4 = new Supply();
        supply4.setSupplierName("Organic Rice Co");
        supply4.setContactPhone("+1-555-0404");
        supply4.setEmail("support@organicrice.com");
        supplyService.createSupply(supply4);

        Rice rice = new Rice();
        rice.setRiceName("Jasmine Rice Premium 5kg");
        rice.setPrice(89.99);
        rice.setSupply(supply);
//        rice.setCreatedAt(Date.valueOf("2024-01-15 09:30:00"));
        riceService.createRice(rice);

        Rice rice2 = new Rice();
        rice2.setRiceName("Basmati Rice Long Grain");
        rice2.setPrice(125.99);
        rice2.setSupply(supply2);
//        rice2.setCreatedAt(Date.valueOf("2024-02-20"));
        riceService.createRice(rice2);

        Rice rice3 = new Rice();
        rice3.setRiceName("Brown Rice Organic 10kg");
        rice3.setPrice(159.99);
        rice3.setSupply(supply3);
//        rice3.setCreatedAt(Date.valueOf("2024-03-10"));
        riceService.createRice(rice3);

        Rice rice4 = new Rice();
        rice4.setRiceName("Sushi Rice Special Grade");
        rice4.setPrice(79.99);
        rice4.setSupply(supply4);
//        rice4.setCreatedAt(Date.valueOf("2024-04-04"));
        riceService.createRice(rice4);
    }
}
