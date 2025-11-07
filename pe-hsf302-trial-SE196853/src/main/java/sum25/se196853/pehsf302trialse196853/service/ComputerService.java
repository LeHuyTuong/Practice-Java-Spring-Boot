package sum25.se196853.pehsf302trialse196853.service;

import sum25.se196853.pehsf302trialse196853.entity.Computer;

public interface ComputerService {
    Computer createComputer(Computer computer);
    boolean updateComputer(int companyId, Computer computer);
}
