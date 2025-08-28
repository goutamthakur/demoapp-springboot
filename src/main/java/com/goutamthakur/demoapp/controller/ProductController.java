package com.goutamthakur.demoapp.controller;

import com.goutamthakur.demoapp.model.Product;
import com.goutamthakur.demoapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProduct(@PathVariable int prodId){
        return service.getProduct(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
