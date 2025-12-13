package com.cakeshop.product;

import com.cakeshop.pricing.PricePolicy;

public class BakedSweet extends Product{
    public BakedSweet(String name,int basePrice,PricePolicy pricePolicy){
        super(name, basePrice, pricePolicy);
    }

    @Override
    public String getCategory(){
        return "焼き菓子";
    }
}