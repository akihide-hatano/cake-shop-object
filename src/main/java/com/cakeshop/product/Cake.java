package com.cakeshop.product;

import com.cakeshop.pricing.PricePolicy;

public class Cake extends Product{
    public Cake(String name,int basePrice,PricePolicy pricePolicy){
        super(name, basePrice,pricePolicy);
    }

    @Override
    public String getCategory(){
        return "生ケーキ";
    }
}