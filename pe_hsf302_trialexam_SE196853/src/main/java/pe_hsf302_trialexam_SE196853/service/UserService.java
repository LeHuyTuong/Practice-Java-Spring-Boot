package pe_hsf302_trialexam_SE196853.service;

import pe_hsf302_trialexam_SE196853.model.User;

public interface UserService {
    User getUser(String email, String password);
    boolean createUser(User user);
}
