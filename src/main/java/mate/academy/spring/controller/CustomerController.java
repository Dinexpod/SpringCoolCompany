package mate.academy.spring.controller;

import mate.academy.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String customer() {
        System.out.println("controller: CUSTOMER");
        customerService.create();
        return "customer/customer";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String customerInfo() {
        System.out.println("controller: CUSTOMER INFO");
        return "customer/info";
    }

//    @RequestMapping(value = "/developer/{developerId}", method = RequestMethod.GET)
//    public String getDeveloperInfo(@PathVariable Long developerId, ModelMap view) {
//        Developer developer = developerService.getDeveloper(developerId);
//        view.put("developer", developer);
//        return "developer/info";
//    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("CUSTOMER CONTROLLER is OK!");
        System.out.println("=============================================");
    }
}
