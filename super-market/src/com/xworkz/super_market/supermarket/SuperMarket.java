package com.xworkz.super_market.supermarket;

import com.xworkz.super_market.product.ProductDetails;

public interface SuperMarket {
    public  boolean addproduct (ProductDetails productDetails);

    public void getProduct();

    public ProductDetails getProductByName(String name);

    public  ProductDetails getProductByCompanyName( String comName);
    public  String getProductById(int id);
}
