package com.goutamthakur.demoapp.service;

import com.goutamthakur.demoapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(1, "Samsung S25 Ultra", 5000),
            new Product(2, "iPhone 16 Pro Max", 7000),
            new Product(3, "Google Pixel 9 Pro", 6000),
            new Product(4, "OnePlus 12R", 4500),
            new Product(5, "Xiaomi 14 Ultra", 4000),
            new Product(6, "Sony Xperia 1 VI", 5500),
            new Product(7, "Realme GT 6", 3500),
            new Product(8, "Asus ROG Phone 8", 6500)
    ));


    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(int prodId){
        return products.stream()
                        .filter(p -> p.getProdId() == prodId)
                        .findFirst()
                        .get();
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProdId() == prod.getProdId()){
                products.set(i, prod);
            }
        }
    }

    public void deleteProduct(int prodId){
        products.removeIf(p -> p.getProdId() == prodId);
    }
}
