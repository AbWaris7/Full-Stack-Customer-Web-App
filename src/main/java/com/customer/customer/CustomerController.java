package com.customer.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi/customers")
public class CustomerController {


    CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    private List<Customer> getCustomers() {

        return customerService.getAllCustomers();
    }

    @GetMapping("{id}")
    private Customer getCustomer(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest request) {
        customerService.addCustomer(request);
    }
}
