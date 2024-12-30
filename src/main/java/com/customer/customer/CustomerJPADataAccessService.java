package com.customer.customer;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("jpa")
public class CustomerJPADataAccessService implements CustomerDao{

    private final CustomerRepository customerRepository;
    public CustomerJPADataAccessService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public List<Customer> selectAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer selectCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public boolean existsPersonWithEmail(String email) {
        return customerRepository.existsCustomerByEmail(email);
    }

    @Override
    public void deleteCustomerById(int id) {

        customerRepository.deleteById(id);
    }

    @Override
    public boolean existsCustomerById(Integer id) {
        return customerRepository.existsById(id);
    }
}
