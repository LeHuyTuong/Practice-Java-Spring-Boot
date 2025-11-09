package fa25.se196853.service.impl;

import fa25.se196853.entity.Supply;
import fa25.se196853.repository.SupplyRepository;
import fa25.se196853.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyServiceImpl implements SupplyService {

    @Autowired
    private SupplyRepository supplyRepository;

    @Override
    public Supply createSupply(Supply supply) {
        return supplyRepository.save(supply);
    }

    @Override
    public Supply getSupplyById(int supplyId) {
        return supplyRepository.findBySupplierId(supplyId);
    }

    @Override
    public List<Supply> getSupplies() {
        return supplyRepository.findAll();
    }
}
