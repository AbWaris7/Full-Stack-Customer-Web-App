package com.customer.customer;
import com.customer.execption.DuplicateResourceException;
import com.customer.execption.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService(@Qualifier("jpa") CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers() {
        return customerDao.selectAllCustomer();
    }

    public Customer getCustomerById(Integer id) {
        return customerDao.selectCustomerById(id);
    }

    public void addCustomer(CustomerRegistrationRequest customerRegistrationRequest) {

        String email = customerRegistrationRequest.email();
        if(customerDao.existsPersonWithEmail(email)) {
            throw  new DuplicateResourceException("customer with email [%s] already exist".formatted(email));
        }

        customerDao.insertCustomer(new Customer(customerRegistrationRequest.name(), customerRegistrationRequest.email(), customerRegistrationRequest.age()));
    }

    public void deleteCustomer(Integer id) {

        customerDao.deleteCustomerById(id);
    }
}
