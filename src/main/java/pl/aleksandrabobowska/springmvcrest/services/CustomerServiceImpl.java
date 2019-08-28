package pl.aleksandrabobowska.springmvcrest.services;

import org.springframework.stereotype.Service;
import pl.aleksandrabobowska.springmvcrest.domain.Customer;
import pl.aleksandrabobowska.springmvcrest.repositories.CustomerRepository;

import java.util.List;

@Service

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
