package fa25.se196853.service;

import fa25.se196853.entity.Supply;

import java.util.List;

public interface SupplyService {
    Supply createSupply(Supply supply);
    Supply getSupplyById(int supplyId);

    List<Supply> getSupplies();
}
