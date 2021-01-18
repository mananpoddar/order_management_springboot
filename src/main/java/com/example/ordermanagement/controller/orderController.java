package com.example.ordermanagement.controller;


import com.example.ordermanagement.model.orders;
import com.example.ordermanagement.repository.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class orderController {
    @Autowired
    orderRepository orderRep;
    //place an order
    @PostMapping("/placeOrder")
    public orders placeOrder(@RequestBody orders order){
         return orderRep.save(order);
    }

    @GetMapping("/getOrderDetails/{order_id}")
    public Optional<orders> getOrder(@PathVariable Long order_id){
        return orderRep.findById(order_id);
    }
}
