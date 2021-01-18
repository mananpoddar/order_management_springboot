package com.example.ordermanagement.repository;

import com.example.ordermanagement.model.orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<orders, Long> {

}