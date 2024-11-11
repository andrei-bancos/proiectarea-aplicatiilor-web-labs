package com.example.lab3.service;

import com.example.lab3.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product productDetails);
    boolean deleteProduct(Long id);
}
