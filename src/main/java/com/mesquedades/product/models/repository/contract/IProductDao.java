package com.mesquedades.product.models.repository.contract;

import com.mesquedades.product.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductDao extends CrudRepository<Product, Long> {
}
