package com.rs.stringboot.product.repository;

import com.rs.stringboot.product.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
