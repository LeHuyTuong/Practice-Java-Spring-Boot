package pe_hsf302_trialexam_SE196853.service;

import pe_hsf302_trialexam_SE196853.model.Computer;

import java.util.List;

public interface ComputerService {
    boolean createComputer(Computer computer);
    void updateComputer(int id, Computer computer);
    void deleteComputer(int computerId);
    List<Computer> getAllComputers();
}
