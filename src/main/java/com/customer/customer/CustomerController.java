package com.customer.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {


    CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    private List<Customer> getCustomers() {

        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    private Customer getCustomer(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }
}
