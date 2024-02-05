package com.xworkz.collections;

import com.xworkz.collections.cycal.Cycal;
import com.xworkz.collections.mobile.Mobile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ExicouterList {

    public static void main(String[] args) {

        List list = new LinkedList();
        list.add(new Mobile(1, "samsung", "samsung"));
        list.add(new Cycal(1, "sprint", "10,000"));
        list.add(new Laptop(1, "lenova", "10,000"));

//        System.out.println(list);
        for (Object ref:list) {
            System.out.println(ref);

        }

    }
}
