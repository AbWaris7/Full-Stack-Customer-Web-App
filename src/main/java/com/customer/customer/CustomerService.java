package com.customer.customer;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers() {
        return customerDao.selectAllCustomer();
    }

    public Customer getCustomerById(Integer id) {
        return customerDao.selectCustomerById(id);
    }
}
