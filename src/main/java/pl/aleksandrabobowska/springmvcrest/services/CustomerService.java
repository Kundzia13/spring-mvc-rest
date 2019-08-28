package pl.aleksandrabobowska.springmvcrest.services;

import pl.aleksandrabobowska.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

   Customer saveCustomer(Customer customer);
}
