package com.cakeshop;

import com.cakeshop.product.Cake;
import com.cakeshop.product.Product;
import com.cakeshop.pricing.NormalPrice;
import com.cakeshop.pricing.PricePolicy;

public class App {
    public static void main(String[] args){
        Product cake = new Cake("フルーツタルト", 600);
        PricePolicy pricePolicy = new NormalPrice();

        int price = pricePolicy.calculate(cake);

        System.out.println(cake.getName()+"の価格は"+price+"円です。");
    }
}