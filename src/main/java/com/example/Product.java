package com.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class Product {
    Map<String, Integer> products;

    @PostConstruct
    public void setup() {
         this.products = new ConcurrentHashMap<>();
    }

    public void givePrices(String product, int price){
        System.out.println("giving price to" +  product + ":" +price);
        this.products.put(product,price);
    }

    public int calculate(String product,int count){
        System.out.println("Calculating :" +product);
        return this.products.get(product) * count;
    }

}
