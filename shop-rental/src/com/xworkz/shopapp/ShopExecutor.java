package com.xworkz.shopapp;

import com.xworkz.shopapp.cafe.CafeShop;
import com.xworkz.shopapp.cloths.ClothsShop;
import com.xworkz.shopapp.electronic_shop.Electronicshop;
import com.xworkz.shopapp.fruits.FruitsShop;
import com.xworkz.shopapp.fruits.Shop;
import com.xworkz.shopapp.kirana_shop.KiranaShop;

public class ShopExecutor {
    public static void main(String[] args) {
        Shop shop=new FruitsShop();
        shop.doBusiness();

        Shop shop1=new CafeShop();
        shop1.doBusiness();

        Shop shop2=new Electronicshop();
        shop2.doBusiness();

        Shop shop3=new ClothsShop();
        shop3.doBusiness();
        Shop shop4=new KiranaShop();
        shop4.doBusiness();

    }

}

