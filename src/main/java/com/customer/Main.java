package com.customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class Main {
    private static ArrayList<Customer> customers;
     static {

        customers = new ArrayList<>();
        customers.add(new Customer(1,"Alex","alex@gamil.com",20));
        customers.add(new Customer(2,"Bob","bob@gamil.com",30));
        customers.add(new Customer(3,"Charlie","charlie@gamil.com",40));
    }

    public static void main(String[] args) {
        System.out.println(customers);
        SpringApplication.run(Main.class, args);
    }



   static class Customer {
        private Integer id;
        private String name;
        private String email;
        private Integer age;
        public Customer(Integer id, String name, String email, Integer age ) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.age = age;
        }
       Customer() {

       }

       public Integer getId() {
           return id;
       }

       public void setId(Integer id) {
           this.id = id;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getEmail() {
           return email;
       }

       public void setEmail(String email) {
           this.email = email;
       }

       public Integer getAge() {
           return age;
       }

       public void setAge(Integer age) {
           this.age = age;
       }

       @Override
       public String toString() {
           return "Customer{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   ", email='" + email + '\'' +
                   ", age=" + age +
                   '}';
       }
   }

   @GetMapping("/customers")
    public List<Customer> getCustomers() {

         return customers;
   }
}
