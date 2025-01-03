package com.customer.customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> selectAllCustomer();
    Customer selectCustomerById(int id);
    void insertCustomer(Customer customer);
    boolean existsPersonWithEmail(String email);
    void deleteCustomerById(int id);
    boolean existsCustomerById(Integer id);
}
