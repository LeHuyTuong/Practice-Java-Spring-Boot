package sum25.se196853.pehsf302trialse196853.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sum25.se196853.pehsf302trialse196853.service.UserService;

@Component
@RequiredArgsConstructor
public class DataInitilaztion implements CommandLineRunner {

    private final UserService userService;


    @Override
    public void run(String... args) throws Exception {

    }
}
