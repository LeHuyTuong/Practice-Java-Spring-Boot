package pe_hsf302_trialexam_SE196853.service;

import pe_hsf302_trialexam_SE196853.model.Computer;
import pe_hsf302_trialexam_SE196853.model.Manufacture;

import java.util.List;

public interface ManufactureService {

    boolean createComputer(Manufacture manufacture);
    void updateComputer(int id, Manufacture manufacture);
    void deleteManufacture(int manufactureId);
    List<Manufacture> getAllComputers();
}
