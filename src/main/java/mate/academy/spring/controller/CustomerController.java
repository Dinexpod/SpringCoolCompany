package mate.academy.spring.controller;

import mate.academy.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return "customer/customer";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String customerInfo() {
        return "customer/info";
    }
}
