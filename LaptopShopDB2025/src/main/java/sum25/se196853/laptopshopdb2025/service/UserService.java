package sum25.se196853.laptopshopdb2025.service;

import sum25.se196853.laptopshopdb2025.entity.User;

public interface UserService {
    User getUser(String email, String password);
}
