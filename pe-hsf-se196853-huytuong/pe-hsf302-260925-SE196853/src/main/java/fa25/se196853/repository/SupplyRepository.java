package fa25.se196853.repository;

import fa25.se196853.entity.Supply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplyRepository extends JpaRepository<Supply, Integer> {
    Supply findBySupplierId(int supplierId);
}
