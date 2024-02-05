package com.xworkz.super_market;

import com.xworkz.super_market.product.ProductDetails;
import com.xworkz.super_market.supermarket.Impl.Dmart;
import com.xworkz.super_market.supermarket.SuperMarket;

import java.util.Scanner;

public class SuperMarketExi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int size= sc.nextInt();
        SuperMarket superMarket=new Dmart(size);

        for (int i = 0; i < size; i++) {
            ProductDetails productDetails=new ProductDetails();
            System.out.println("enter the id");
            productDetails.setId(sc.nextInt());
            System.out.println("enter the name");
            productDetails.setName(sc.next());
            System.out.println("enter the mfg date");
            productDetails.setMfgDate(sc.next());
            System.out.println("enter the exp date");
            productDetails.setExpDate(sc.next());
            System.out.println("enter the company name");
            productDetails.setComName(sc.next());


            superMarket.addproduct(productDetails);




        }
        superMarket.getProduct();

        System.out.println("get product by name");
        ProductDetails product =superMarket.getProductByName(sc.next());
        System.out.println(product);
        System.out.println("getProductByCompanyName");
        ProductDetails details=superMarket.getProductByCompanyName(sc.next());
        System.out.println(details);



    }
}
