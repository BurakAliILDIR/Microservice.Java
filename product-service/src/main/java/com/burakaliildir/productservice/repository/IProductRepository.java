package com.burakaliildir.productservice.repository;

import com.burakaliildir.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {

    


}
