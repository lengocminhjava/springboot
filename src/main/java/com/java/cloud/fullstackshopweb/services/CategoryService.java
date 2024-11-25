package com.java.cloud.fullstackshopweb.services;

import com.java.cloud.fullstackshopweb.entities.Category;
import com.java.cloud.fullstackshopweb.entities.Product;
import com.java.cloud.fullstackshopweb.repository.CategoryRepositoy;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepositoy categoryRepositoy;

    public CategoryService(CategoryRepositoy categoryRepositoy) {
        this.categoryRepositoy = categoryRepositoy;
    }

    public List<Category> getAllCategories() {
        return categoryRepositoy.findAll();
    }

    public Category saveCategory(Category category) {
        return categoryRepositoy.save(category);
    }

    public void deleteCategory(Integer id) {
        categoryRepositoy.deleteById(id);
    }

    public Category updateCategory(Integer id, Category updatedCategory) {
        if (!categoryRepositoy.existsById(id)) {
            throw new EntityNotFoundException("Category with ID " + id + " not found");
        }
        updatedCategory.setId(id);
        return categoryRepositoy.save(updatedCategory);
    }
}
