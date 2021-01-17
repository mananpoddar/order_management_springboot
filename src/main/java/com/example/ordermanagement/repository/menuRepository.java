package com.example.ordermanagement.repository;
import com.example.ordermanagement.model.menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface menuRepository extends JpaRepository<menu, Long> {

}
