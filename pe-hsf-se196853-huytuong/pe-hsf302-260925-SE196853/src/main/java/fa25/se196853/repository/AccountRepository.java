package fa25.se196853.repository;

import fa25.se196853.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByEmailAndPassword(String email, String password);
}
