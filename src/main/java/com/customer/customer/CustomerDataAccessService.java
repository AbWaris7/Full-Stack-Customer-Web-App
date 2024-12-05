package com.customer.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDataAccessService implements CustomerDao {

    private static final ArrayList<Customer> customers;

    static {

        customers = new ArrayList<>();
        customers.add(new Customer(1, "Alex", "alex@gamil.com", 20));
        customers.add(new Customer(2, "Bob", "bob@gamil.com", 30));
        customers.add(new Customer(3, "Charlie", "charlie@gamil.com", 40));
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return customers;
    }

    @Override
    public Customer selectCustomerById(int id) {
        return customers.get(id);
    }
}
