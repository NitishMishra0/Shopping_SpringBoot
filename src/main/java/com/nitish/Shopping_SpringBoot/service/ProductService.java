package com.nitish.Shopping_SpringBoot.service;

import com.nitish.Shopping_SpringBoot.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Canon Camera",70000),
            new Product(103,"Shure Mic",10000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductsById(int prodId){
        return products.stream()
                .filter(p->p.getProdId() == prodId )
                .findFirst().orElse(new Product(100,"Not Found",0));
    }

    public void addProduct(Product prod){
         products.add(prod);
    }

    public void updateProduct(Product pro){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == pro.getProdId()) {
                products.set(i, pro);
                return;
            }
        }
    }

    public void deleteProduct(int prodId) {
        for (int i=0; i<products.size(); i++){
            if (products.get(i).getProdId()==prodId){
                products.remove(i);
                break;
            }
        }
    }
}
