package pe_hsf302_trialexam_SE196853.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pe_hsf302_trialexam_SE196853.service.ComputerService;

@Controller
public class ProductController {

    @Autowired
    private ComputerService computerService;


}
