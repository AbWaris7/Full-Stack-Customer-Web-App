package com.customer.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("list")
public class CustomerListDataAccessService implements CustomerDao {

    private static final ArrayList<Customer> customers;

    static {

        customers = new ArrayList<>();
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return customers;
    }

    @Override
    public Customer selectCustomerById(int id) {
        return customers.get(id);
    }

    @Override
    public void insertCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public boolean existsPersonWithEmail(String email) {
        return customers.stream().anyMatch(customer -> customer.getEmail().equals(email));
    }

    @Override
    public void deleteCustomerById(int id) {
        customers.removeIf(customer -> customer.getId() == id);
    }

    @Override
    public boolean existsCustomerById(Integer id) {
        return customers.stream().anyMatch(customer -> customer.getId() == id);
    }
}
