package com.mesquedades.product.controllers;

import com.mesquedades.product.models.entity.Product;
import com.mesquedades.product.models.service.contract.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/products")
    public List<Product> list() {
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product detail(@PathVariable Long id) {
        return productService.findById(id);
    }
}
