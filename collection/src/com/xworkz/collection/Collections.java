package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {
    public static void main(String[] args) {
        Collection collection =new ArrayList();

        collection.add("momos");
        collection.add("pav bhaji");
        collection.add("vadapaw");
        collection.add(" panipuri");

        Collection collection1=new ArrayList();

        collection1.add("momos");
        collection1.add("pav bhaji");
        collection1.add("vadapaw");
        collection1.add(" panipuri");
        collection1.addAll(collection);
        System.out.println(collection1.size());
        System.out.println(collection.size());
        System.out.println(collection1);
        for(Object ref :collection1){
            System.out.println(ref.toString());
            collection.forEach(System.out::println);

        }
    }
}
