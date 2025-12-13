package com.cakeshop.pricing;

public interface PricePolicy {
    int calculate(int basePrice);
}