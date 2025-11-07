package pe_hsf302_trialexam_SE196853.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pe_hsf302_trialexam_SE196853.model.User;
import pe_hsf302_trialexam_SE196853.service.UserService;

@Component
public class DataInitalizer implements CommandLineRunner {

    @Autowired
    private UserService userService;
    @Override
    public void run(String... args) throws Exception {
        if(userService.getUser("admin@gmail.com", "user@gmail.com") != null){
            return ;
        }
        else{
            User user = new User();
            user.setEmail("admin@laptopshop.com");
            user.setPassword("@1");
            user.setRole("Admin");

            User user1 = new User();
            user1.setEmail("staff@laptopshop.com");
            user1.setPassword("@2");
            user1.setRole("Staff");

            User user2 = new User();
            user1.setEmail("member@laptopshop.com");
            user1.setPassword("@3");
            user1.setRole("Member");


        }
    }
}
