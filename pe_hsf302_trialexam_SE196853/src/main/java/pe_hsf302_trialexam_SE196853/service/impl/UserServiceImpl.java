package pe_hsf302_trialexam_SE196853.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe_hsf302_trialexam_SE196853.model.User;
import pe_hsf302_trialexam_SE196853.repository.UserRepository;
import pe_hsf302_trialexam_SE196853.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUser(String email, String password) {
        return  userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public boolean createUser(User user) {
        return userRepository.save(user) != null;
    }
}
