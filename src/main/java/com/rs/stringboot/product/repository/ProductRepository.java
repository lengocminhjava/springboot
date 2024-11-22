package com.rs.stringboot.product.repository;

import com.rs.stringboot.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
