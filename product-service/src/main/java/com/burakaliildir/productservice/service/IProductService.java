package com.burakaliildir.productservice.service;

import com.burakaliildir.productservice.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    Product save(Product product);

    void delete(Long id);
}
