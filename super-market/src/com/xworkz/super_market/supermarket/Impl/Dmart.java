package com.xworkz.super_market.supermarket.Impl;

import com.xworkz.super_market.product.ProductDetails;
import com.xworkz.super_market.supermarket.SuperMarket;

public class Dmart implements SuperMarket {


ProductDetails product[];
int index;
    public Dmart( int size) {

        product=new ProductDetails[size];
    }
    @Override
    public boolean addproduct(ProductDetails product) {
        boolean isAdded=false;
        if(product!=null){
            this.product[index++]=product;
            isAdded=true;
        }
        return isAdded;
    }

    @Override
    public void getProduct() {
        for (int index = 0; index < product.length; index++) {
            System.out.println(product[index].getId()+ " "+product[index].getName()+" "+
                                product[index].getComName()+" "+product[index].getMfgDate()+" "+
                                        product[index].getExpDate());

        }

    }

    @Override
    public ProductDetails getProductByName(String name) {
        ProductDetails details=null;
        for (int index = 0; index <product.length ; index++) {
            if(product[index].getName().equals(name)){
                details=product[index];
            }

        }
        return details;
    }

    @Override
    public ProductDetails getProductByCompanyName(String comName) {
        ProductDetails details=null;
        for (int index = 0; index < product.length; index++) {
            if(product[index].getComName().equals(comName)){
                details=product[index];
            }
        }
        return details;
    }

    @Override
    public String getProductById(int id) {
        String pro=null;
        for (int index = 0; index <product.length; index++) {
            if(product[index].getId()==id){
         pro=product[index].getComName();
            }

        }
        return pro;
    }
}

