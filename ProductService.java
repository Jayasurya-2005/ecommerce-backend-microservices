package com.EcommerceApplication.project.service;
import com.EcommerceApplication.project.entity.*;
import com.EcommerceApplication.project.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product saveProduct(Product product) {
        return repo.save(product);
    }
    public Product getProductById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product newProduct) {
        Product existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(newProduct.getName());
            existing.setPrice(newProduct.getPrice());
            existing.setDescription(newProduct.getDescription());
            existing.setImageUrl(newProduct.getImageUrl());

            return repo.save(existing);
        }

        return null;
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
}