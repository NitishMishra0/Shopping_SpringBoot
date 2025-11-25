package com.nitish.Shopping_SpringBoot.controller;

import com.nitish.Shopping_SpringBoot.model.Product;
import com.nitish.Shopping_SpringBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/product")
    public Product getProductById(int prodId){
        return service.getProductsById(prodId);
    }

}
