package com.xworkz.officer;

import com.xworkz.officer.officerInfo.OfficerInfo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionOfficerExicouter {

    public static void main(String[] args) {
        Map <Integer, OfficerInfo>map=new HashMap<Integer,OfficerInfo>();
        map.put(1,new OfficerInfo(1,"shree","dcp","8725439987"));
        map.put(3,new OfficerInfo(3,"lalu","sp","8792296196"));
        map.put(2,new OfficerInfo(2,"gandha","si","7019551945"));
        map.put(4,new OfficerInfo(4,"prash","acp","9448927100"));

             Set<Map.Entry<Integer,OfficerInfo>> entries=map.entrySet();
       Iterator<Map.Entry<Integer,OfficerInfo>> iterator =entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,OfficerInfo> hi = iterator.next() ;

            System.out.println(hi.getKey()+" "+hi.getValue());
        }

     







//        for (Map.Entry<Integer,OfficerInfo> entry: map.entrySet()) {
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//
//        }
    }
}
