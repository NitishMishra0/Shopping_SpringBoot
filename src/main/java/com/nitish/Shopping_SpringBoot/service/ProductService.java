package com.nitish.Shopping_SpringBoot.service;

import com.nitish.Shopping_SpringBoot.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Canon Camera",70000),
            new Product(103,"Shure Mic",10000));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
                .filter(p->p.getProdId() == prodId )
                .findFirst().get();
    }

}
