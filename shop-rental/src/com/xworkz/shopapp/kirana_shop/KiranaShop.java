package com.xworkz.shopapp.kirana_shop;

import com.xworkz.shopapp.fruits.Shop;

public class KiranaShop implements Shop {
    @Override
    public void doBusiness() {
        System.out.println("selling groceries");
    }
}
