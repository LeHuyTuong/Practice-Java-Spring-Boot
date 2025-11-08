package sum25.se196853.pehsf302663825se196853.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sum25.se196853.pehsf302663825se196853.model.User;
import sum25.se196853.pehsf302663825se196853.repository.UserRepository;
import sum25.se196853.pehsf302663825se196853.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }


}
