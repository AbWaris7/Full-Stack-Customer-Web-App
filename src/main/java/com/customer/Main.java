package com.customer;
import com.customer.customer.Customer;
import com.customer.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {
            addCustomer(customerRepository);
        };
    }

    private void addCustomer(CustomerRepository customerRepository) {



        Customer alex = new Customer( "Alex", "alex@gamil.com", 20);
        Customer bob = new Customer( "Bob", "bob@gamil.com", 30);
        Customer abdul = new Customer( "Abdul", "abdul@gamil.com", 40);
        List<Customer> customers = List.of(alex, bob, abdul);
        customerRepository.saveAll(customers);
    }

}
