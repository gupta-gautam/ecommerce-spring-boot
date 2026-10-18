package com.ecommerce.project.service;

import com.ecommerce.project.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product addProduct(Product product, Long categoryId);

    Product getProductById(Long productId);

}
