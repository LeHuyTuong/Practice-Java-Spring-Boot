package fa25.se196853.service.impl;

import fa25.se196853.entity.Rice;
import fa25.se196853.repository.RiceRepository;
import fa25.se196853.service.RiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiceServiceImpl implements RiceService {

    @Autowired
    private RiceRepository riceRepository;

    @Override
    public Rice createRice(Rice rice) {
        return riceRepository.save(rice);
    }

    @Override
    public void updateRice(Rice rice) {

    }

    @Override
    public void deleteRice(Rice rice) {

    }

    @Override
    public List<Rice> getAllRice() {
        return riceRepository.findAll();
    }
}
