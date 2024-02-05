package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollectionExi {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("geeta");
        list.add("sita");
        list.add("nita");
        list.add("anita");
//        System.out.println("retriviving data from foreach loop");
//        for (Object ohh : list) {
//            System.out.println(ohh);
//
//        }
        System.out.println("retriving data from itarator");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }
        System.out.println("retriving  the updated data from itarator");
        list.add("rose");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);


//            while (iterator.hasNext()) {
//                if (iterator.next().equals("kavita")) {
//                    iterator.remove();
//
//                }
//
//            }
//            System.out.println(list);
  }
    }
}
// list.add("dog ");
//         list.add("cat");
//         list.add("cow");
//         list.add("lion");
//         list.add("tiger");
//         list.add("sheep");
//         list.add("got");
//         list.add("elephant");
//         list.add("fox");
//         list.add("ox");
//         list.add("rabbit");
//         list.add(null);
//         list.add(null);
//         list.add(null);
//         System.out.println(list);
//         System.out.println(list.get(3));
//         list.add(3,"human");
//         System.out.println(list);
//         System.out.println(list.get(2));
//         list.remove(3);
//         System.out.println(list);
//
