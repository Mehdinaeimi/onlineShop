package com.example.onlineShop;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends BaseRepository<Product, Long> {
    List<Product> findByCategory(String category);
}

interface CustomerRepository extends BaseRepository<Customer, Long> {
    Customer findByEmail(String email);
}

