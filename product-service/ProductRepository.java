package com.EcommerceApplication.project.repository;
import com.EcommerceApplication.project.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
