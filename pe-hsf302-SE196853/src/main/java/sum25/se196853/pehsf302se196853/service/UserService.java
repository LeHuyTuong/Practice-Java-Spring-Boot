package sum25.se196853.pehsf302se196853.service;

import sum25.se196853.pehsf302se196853.entity.User;

public interface UserService {
    User getUser(String email, String password);
}
