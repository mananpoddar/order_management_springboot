package com.example.ordermanagement.repository;
import com.example.ordermanagement.model.customerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerInfoRepository extends JpaRepository<customerInfo, Long> {

}
