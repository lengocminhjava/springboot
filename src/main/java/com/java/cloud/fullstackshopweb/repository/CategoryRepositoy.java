package com.java.cloud.fullstackshopweb.repository;

import com.java.cloud.fullstackshopweb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositoy extends JpaRepository<Category, Integer> {

}
