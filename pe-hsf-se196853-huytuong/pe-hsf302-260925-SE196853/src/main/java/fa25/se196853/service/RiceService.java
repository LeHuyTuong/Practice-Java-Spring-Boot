package fa25.se196853.service;

import fa25.se196853.entity.Rice;

import java.util.List;

public interface RiceService {
    Rice createRice(Rice rice);
    void  updateRice(Rice rice);
    void deleteRice(Rice rice);
    List<Rice> getAllRice();
}
