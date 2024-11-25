package com.java.cloud.fullstackshopweb.repository;

import com.java.cloud.fullstackshopweb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoy extends JpaRepository<Product, Integer> {
}
