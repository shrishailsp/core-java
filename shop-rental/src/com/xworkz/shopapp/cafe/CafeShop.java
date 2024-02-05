package com.xworkz.shopapp.cafe;

import com.xworkz.shopapp.fruits.Shop;

public class CafeShop implements Shop {
    @Override
    public void doBusiness() {
        System.out.println(("make money by selling hot beverages"));
    }
}
