package com.java.cloud.fullstackshopweb.services;

import com.java.cloud.fullstackshopweb.entities.Product;
import com.java.cloud.fullstackshopweb.repository.ProductRepositoy;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepositoy productRepositoy;

    public ProductService(ProductRepositoy productRepositoy) {
        this.productRepositoy = productRepositoy;
    }

    public List<Product> getAllProducts() {
        return productRepositoy.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepositoy.save(product);
    }

    public void deleteProduct(Integer id) {
        productRepositoy.deleteById(id);
    }

    public Product updateProduct(Integer id, Product updatedProduct) {
        if (!productRepositoy.existsById(id)) {
            throw new EntityNotFoundException("Product with ID " + id + " not found");
        }
        updatedProduct.setId(id);
        return productRepositoy.save(updatedProduct);
    }
}
