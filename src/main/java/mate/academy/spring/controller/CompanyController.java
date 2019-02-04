package mate.academy.spring.controller;

import mate.academy.spring.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String company() {
        return "company/company";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String companyInfo() {
        return "company/info";
    }
}
