package com.xworkz.collections;

import com.xworkz.collections.cycal.Cycal;
import com.xworkz.collections.mobile.Mobile;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExicouterQueu {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add(new Mobile(1, "samsung", "samsung"));
        queue.add(new Cycal(1, "sprint", "10,000"));
        queue.add(new Laptop(1, "lenova", "10,000"));

//        System.out.println(list);
        for (Object ref : queue) {
            System.out.println(ref);

        }
    }
}
