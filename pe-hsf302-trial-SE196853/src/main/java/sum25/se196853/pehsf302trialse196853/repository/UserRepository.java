package sum25.se196853.pehsf302trialse196853.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sum25.se196853.pehsf302trialse196853.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmailAndPassword(String email, String password);
}
