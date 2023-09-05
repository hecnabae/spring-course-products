package com.mesquedades.product.models.service.contract;

import com.mesquedades.product.models.entity.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();

    public Product findById(Long id);

    public Product save(Product product);

    public void delete(Long id);

    public Product update(Product product);
}
