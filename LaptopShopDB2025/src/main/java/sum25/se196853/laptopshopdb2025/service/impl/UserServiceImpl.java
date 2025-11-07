package sum25.se196853.laptopshopdb2025.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sum25.se196853.laptopshopdb2025.entity.User;
import sum25.se196853.laptopshopdb2025.repository.UserRepository;
import sum25.se196853.laptopshopdb2025.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }


}
