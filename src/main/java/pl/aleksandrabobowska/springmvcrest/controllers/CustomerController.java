package pl.aleksandrabobowska.springmvcrest.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.aleksandrabobowska.springmvcrest.domain.Customer;
import pl.aleksandrabobowska.springmvcrest.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "api/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomers(){
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable Long id){
       return customerService.findCustomerById(id);
    }

    @PostMapping
   @ResponseStatus(HttpStatus.CREATED) // reason="To show an example of a custom message"
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }
}
