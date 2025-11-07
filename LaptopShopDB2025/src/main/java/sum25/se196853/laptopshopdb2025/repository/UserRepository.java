package sum25.se196853.laptopshopdb2025.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sum25.se196853.laptopshopdb2025.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmailAndPassword(String email, String password);
}
