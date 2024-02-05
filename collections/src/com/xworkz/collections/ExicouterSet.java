package com.xworkz.collections;

import com.xworkz.collections.cycal.Cycal;
import com.xworkz.collections.mobile.Mobile;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExicouterSet {
    public static void main(String[] args) {
     Set set=new HashSet();
        set.add(new Mobile(1, "samsung", "samsung"));
        set.add(new Mobile(3, "samsung", "samsung"));
        set.add(new Mobile(2, "samsung", "samsung"));
//        set.add(new Cycal(3, "sprint", "10,000"));
//        set.add(new Cycal(1, "sprint", "10,000"));
//        set.add(new Cycal(2, "sprint", "10,000"));
//        set.add(new Laptop(1, "lenova", "10,000"set.add(new Mobile(1, "samsung", "samsung"));));

//        System.out.println(list);
        for (Object ref:set) {
            System.out.println(ref);
        }
    }
}
