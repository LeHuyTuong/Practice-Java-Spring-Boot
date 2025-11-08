package sum25.se196853.pehsf302663825se196853.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sum25.se196853.pehsf302663825se196853.model.User;
import sum25.se196853.pehsf302663825se196853.repository.UserRepository;

@Component
public class DataInitilization implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        if(userRepository.findAll().size()==0){
            return;
        }
        User user = new  User();
        user.setEmail("tuong2005@gmail.com");
        user.setPassword("@1");
        user.setRole("admin");
        userRepository.save(user);
    }
}
