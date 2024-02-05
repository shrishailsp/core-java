package com.xworkz.super_market.product;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDetails {
    private int id;

    @Override
    public String toString() {
        return "ProductDetails{" + "id=" +
                this.id +
                ", name='" +  this.name + '\'' +
                ", mfgDate='" + this.mfgDate + '\'' +
                ", expDate='" + this.expDate + '\'' +
                ", comName='" + this.comName + '\'' +
                '}';
    }

    private String name;
    private  String mfgDate;
    private  String expDate;
    private  String comName;

}

