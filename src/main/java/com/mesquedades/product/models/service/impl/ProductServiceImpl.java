package com.mesquedades.product.models.service.impl;

import com.mesquedades.product.models.entity.Product;
import com.mesquedades.product.models.repository.contract.IProductDao;
import com.mesquedades.product.models.service.contract.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// Registrar componente en el contenedor de Spring (IoC)
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) productDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Product update(Product product) {
        return null;
    }
}
