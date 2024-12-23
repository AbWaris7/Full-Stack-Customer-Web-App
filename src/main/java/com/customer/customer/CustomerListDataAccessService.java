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
}
