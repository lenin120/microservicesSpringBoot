package com.bdiformation.springboot.app.products.models.dao;

import com.bdiformation.springboot.app.products.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository<Product, Long> {

}
