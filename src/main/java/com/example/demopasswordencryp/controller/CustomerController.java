package com.example.demopasswordencryp.controller;

import com.example.demopasswordencryp.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {


    private static final List<Customer> CUSTOMERS = Arrays.asList(
            new Customer("01C", "Agung Wicaksono Putro"),
            new Customer("02C", "Afif Abdurahaman"),
            new Customer("03C", "Dani Prabowo")
    );
    @GetMapping(path = "/{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") String customerId){
        return CUSTOMERS.stream()
                .filter(customer -> customerId.equals(customer.getIdCustomer()))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("Customer " + customerId + "Not exist"));
    }
}
