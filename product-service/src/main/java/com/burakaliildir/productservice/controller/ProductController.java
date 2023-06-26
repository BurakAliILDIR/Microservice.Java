package com.burakaliildir.productservice.controller;

import com.burakaliildir.productservice.model.Product;
import com.burakaliildir.productservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public ResponseEntity<?> all() {

        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Product product) {

        return ResponseEntity.ok(productService.save(product));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(Long id) {
        productService.delete(id);

        return ResponseEntity.ok(null);
    }

}
