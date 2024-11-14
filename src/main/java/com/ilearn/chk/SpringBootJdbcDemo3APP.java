package com.ilearn.chk;

import java.util.List;

import com.ilearn.chk.allother.Customer;
import com.ilearn.chk.allother.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcDemo3APP implements CommandLineRunner {

    @Autowired CustomerDAO custDAO;


    @Override
    public void run(String... args) {
        // 1.Add the Customer
        Customer cust = new Customer(102, "hai", "hai@jlc", 12345, "Blore");
        custDAO.addCustomer(cust);

        // 2.get All Customers
        List<Customer> mylist1 = custDAO.getAllCustomers();
        mylist1.forEach(mycust -> System.out.println(mycust));
        System.out.println("-----------");
        
        // 3.Get Customers By City
        List<Customer> mylist2 = custDAO.getCustomersByCity("Blore");
        mylist2.forEach(mycust -> System.out.println(mycust));
        System.out.println("Done!!!");

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJdbcDemo3APP.class, args);
    }
}
