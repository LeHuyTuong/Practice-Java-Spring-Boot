package sum25.se196853.pehsf302663825se196853.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sum25.se196853.pehsf302663825se196853.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmailAndPassword(String email, String password);
}
