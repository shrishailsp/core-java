package com.xworkz.collection;

import java.util.*;

public class SetCollectionExi {
    public static void main(String[] args) {
//      Set officerInfo =new LinkedHashSet();
//      officerInfo.add(1);
//      officerInfo.add("shri");
//      officerInfo.add(35);
//      officerInfo.add("rajajinagar");
//      officerInfo.add("si");
//      System.out.println(officerInfo);
//
//
//      Set officerInfo1=new LinkedHashSet();
//      officerInfo1.add(2);
//      officerInfo1.add("prakah");
//      officerInfo1.add(30);
//      officerInfo1.add("rr nagar");
//      officerInfo1.add("psi");
//      System.out.println(officerInfo1);

Map<Integer,String> map=new HashMap<Integer,String>();

map.put(1,"Teliphone");
        map.put(3,"Teliphone");
          map.put(3,"hi");
        System.out.println(  map.put(3,"hello"));
      map.put(2,"Teliphone");
      map.put(5,"Teliphone");
      map.put(4,"Mocrophone");
      map.put(7,"MobilePhone");
      map.put(6,"Teliphone");

      System.out.println(map);

Set<Map.Entry<Integer,String>>ent= map.entrySet();

        for (Map.Entry<Integer,String> entry: ent) {
            System.out.println(entry.getKey()+" = "+ entry.getValue());

        }
        }




    }

