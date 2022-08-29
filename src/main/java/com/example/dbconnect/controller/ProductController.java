package com.example.dbconnect.controller;

import javax.xml.ws.Response;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbconnect.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok(this.productRepository.findAll());
    }
}