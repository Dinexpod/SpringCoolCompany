package mate.academy.spring.controller;

import mate.academy.spring.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

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
        System.out.println("controller: COMPANY");
        companyService.create();
        return "company/company";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String companyInfo() {
        System.out.println("controller: COMPANY INFO");
        return "company/info";
    }

//    @RequestMapping(value = "/developer/{developerId}", method = RequestMethod.GET)
//    public String getDeveloperInfo(@PathVariable Long developerId, ModelMap view) {
//        Developer developer = developerService.getDeveloper(developerId);
//        view.put("developer", developer);
//        return "developer/info";
//    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("COMPANY CONTROLLER is OK!");
        System.out.println("=============================================");
    }
}
