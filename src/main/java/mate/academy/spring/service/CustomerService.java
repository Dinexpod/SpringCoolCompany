package mate.academy.spring.service;

import mate.academy.spring.model.Customer;
import mate.academy.spring.model.Developer;

public interface CustomerService {
    void create();
    Customer getCustomer(Long id);
}
