package com.cakeshop;

import com.cakeshop.product.Cake;
import com.cakeshop.product.Product;
import com.cakeshop.pricing.NormalPrice;
import com.cakeshop.pricing.PricePolicy;

public class App {
    public static void main(String[] args){
    Product cake1 = new Cake("フルーツショート", 520, new NormalPrice());
    Product cake2 = new Cake("ベリーミックスケーキ", 580, new NormalPrice());
    Product cake3 = new Cake("チョコレートケーキ", 550, new NormalPrice());
    Product cake4 = new Cake("ガトーショコラ", 600, new NormalPrice());
    Product cake5 = new Cake("アイスケーキ", 650, new NormalPrice());
    Product cake6 = new Cake("クッキーアイスサンド", 480, new NormalPrice());
    Product cake7 = new Cake("ショートケーキ", 500, new NormalPrice());
    Product cake8 = new Cake("モンブラン", 620, new NormalPrice());
    Product cake9 = new Cake("チーズケーキ", 580, new NormalPrice());
    Product cake10 = new Cake("ティラミス", 560, new NormalPrice());


        System.out.println(cake1.getName()+"の価格は"+cake1.getPrice()+"円です。");
        System.out.println(cake2.getName()+"の価格は"+cake2.getPrice()+"円です。");
        System.out.println(cake3.getName()+"の価格は"+cake3.getPrice()+"円です。");
        System.out.println(cake4.getName()+"の価格は"+cake4.getPrice()+"円です。");
        System.out.println(cake5.getName()+"の価格は"+cake5.getPrice()+"円です。");
        System.out.println(cake6.getName()+"の価格は"+cake6.getPrice()+"円です。");
        System.out.println(cake7.getName()+"の価格は"+cake7.getPrice()+"円です。");
        System.out.println(cake8.getName()+"の価格は"+cake8.getPrice()+"円です。");
        System.out.println(cake9.getName()+"の価格は"+cake9.getPrice()+"円です。");
        System.out.println(cake10.getName()+"の価格は"+cake10.getPrice()+"円です。");
    }
}