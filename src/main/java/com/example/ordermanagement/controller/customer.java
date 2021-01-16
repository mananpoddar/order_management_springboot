package com.example.ordermanagement.controller;

import com.example.ordermanagement.model.customerInfo;
import com.example.ordermanagement.repository.customerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class customer {

    @Autowired
    customerInfoRepository customerInfoRep;


    // Get All customers
    @GetMapping("/getCustomers")
    public List<customerInfo> getAllNotes() {
        System.out.println("get called..");
        return customerInfoRep.findAll();
    }

    // Create a new customer
    @PostMapping("/addCustomer")
    public customerInfo createNote(@RequestBody customerInfo customer) {
//        System.out.println(customer.getName());
        return customerInfoRep.save(customer);
    }

    // Get a Single Note

    // Update a Note

    // Delete a Note
}
