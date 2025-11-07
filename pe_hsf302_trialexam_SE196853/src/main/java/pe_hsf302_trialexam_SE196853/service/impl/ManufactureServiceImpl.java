package pe_hsf302_trialexam_SE196853.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe_hsf302_trialexam_SE196853.model.Computer;
import pe_hsf302_trialexam_SE196853.model.Manufacture;
import pe_hsf302_trialexam_SE196853.repository.ManufactureRepository;
import pe_hsf302_trialexam_SE196853.service.ManufactureService;

import java.util.List;

@Service
public class ManufactureServiceImpl implements ManufactureService {

    @Autowired
    private ManufactureRepository manufactureRepository;

    @Override
    public boolean createComputer(Manufacture manufacture) {
        return manufactureRepository.save(manufacture) != null;
    }

    @Override
    public void updateComputer(int id,Manufacture updateManufacture) {
        Manufacture existManufacture = manufactureRepository.findById(id)
                .orElse(null );
        if(existManufacture != null) {
            existManufacture.setManufactureName(updateManufacture.getManufactureName());
            existManufacture.setManufactureName(updateManufacture.getManufactureName());
            manufactureRepository.save(existManufacture);
        }
    }

    @Override
    public void deleteManufacture(int manufactureId) {
        if(manufactureRepository.existsById(manufactureId)) {
            manufactureRepository.deleteById(manufactureId);
        }
    }

    @Override
    public List<Manufacture> getAllComputers() {
        return manufactureRepository.findAll();
    }
}
