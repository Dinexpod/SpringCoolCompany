package mate.academy.spring.service;

import mate.academy.spring.model.Customer;
import mate.academy.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("customerService")
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void create() {
        Customer customer = new Customer();

        customer.setCustomerName("Sem");
        customer.setCustomerAge(23);

        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(Long id) {
        return null;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("CustomerServiceImpl is OK!");
        System.out.println("=============================================");
    }
}
