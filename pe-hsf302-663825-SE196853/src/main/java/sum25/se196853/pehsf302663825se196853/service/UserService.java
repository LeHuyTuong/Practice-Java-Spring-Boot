package sum25.se196853.pehsf302663825se196853.service;

import sum25.se196853.pehsf302663825se196853.model.User;

public interface UserService {
    User getUser(String email,String password);

    User createUser(User user);
}
