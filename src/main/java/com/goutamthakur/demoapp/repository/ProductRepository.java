package com.goutamthakur.demoapp.repository;

import com.goutamthakur.demoapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
