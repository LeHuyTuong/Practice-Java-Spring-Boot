package pe_hsf302_trialexam_SE196853.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe_hsf302_trialexam_SE196853.model.Computer;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Integer> {
}
