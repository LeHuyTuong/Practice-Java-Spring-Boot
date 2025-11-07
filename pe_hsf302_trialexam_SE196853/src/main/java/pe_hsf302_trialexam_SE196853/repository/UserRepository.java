package pe_hsf302_trialexam_SE196853.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe_hsf302_trialexam_SE196853.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmailAndPassword(String email, String password);
}
