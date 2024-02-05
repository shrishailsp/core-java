package com.xworkz.shopapp.cloths;

import com.xworkz.shopapp.fruits.Shop;

public class ClothsShop implements Shop {
    @Override
    public void doBusiness() {
        System.out.println("earning money by selling quality cloths");
    }
}
