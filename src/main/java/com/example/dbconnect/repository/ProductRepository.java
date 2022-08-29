package com.example.dbconnect.repository;

import org.springframework.stereotype.Repository;

import com.example.dbconnect.model.Product;

@Repository
public class ProductRepository extends JpaRepository<Product, Long> {
    
}
