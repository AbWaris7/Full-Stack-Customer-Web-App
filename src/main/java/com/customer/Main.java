package com.customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }



   class Customer {
        private Integer id;
        private String name;
        private String email;
        public Customer(Integer id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
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

       @Override
       public String toString() {
           return "Customer{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   ", email='" + email + '\'' +
                   '}';
       }
   }
}
