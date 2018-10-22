package com.example.demo.services;


import com.example.demo.domain.Product;

public interface ProductService
{
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteById (Integer id);
}
