package pe_hsf302_trialexam_SE196853.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe_hsf302_trialexam_SE196853.model.Computer;
import pe_hsf302_trialexam_SE196853.repository.ComputerRepository;
import pe_hsf302_trialexam_SE196853.service.ComputerService;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService {

    @Autowired
    private ComputerRepository computerRepository;

    @Override
    public boolean createComputer(Computer computer) {
        return computerRepository.save(computer) != null;
    }

    @Override
    public void updateComputer(int id, Computer computer) {
        Computer existingComputer = computerRepository.findById(id)
                .orElse(null);
        if(existingComputer != null){
            existingComputer.setComputerModel(computer.getComputerModel());
            existingComputer.setYear(computer.getYear());
            existingComputer.setManufacture(computer.getManufacture());
            existingComputer.setPrice(computer.getPrice());
            computerRepository.save(existingComputer);
        }
    }

    @Override
    public void deleteComputer(int computerId) {
        if(computerRepository.existsById(computerId)){
            computerRepository.deleteById(computerId);
        }
    }

    @Override
    public List<Computer> getAllComputers() {
        return computerRepository.findAll();
    }
}
