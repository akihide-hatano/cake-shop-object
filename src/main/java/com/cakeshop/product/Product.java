package com.cakeshop.product;

import com.cakeshop.pricing.PricePolicy;

public abstract class Product {

    protected String name;
    protected int basePrice;
    protected PricePolicy pricePolicy;

    public Product(String name,int basePrice,PricePolicy pricePolicy){
        this.name = name;
        this.basePrice = basePrice;
        this.pricePolicy = pricePolicy;
    }
    
    public String getName() {
        return name;
    }

    public int getPrice(){
        return pricePolicy.calculate(basePrice);
    }

    public abstract String getCategory();
}