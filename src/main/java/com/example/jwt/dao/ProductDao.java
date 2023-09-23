package com.example.jwt.dao;

import com.example.jwt.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository<Product,Integer> {
}
