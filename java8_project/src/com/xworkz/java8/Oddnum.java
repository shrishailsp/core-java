package com.xworkz.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Oddnum {
    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(33);
        integers.add(45);
        integers.add(56);
        integers.add(88);
        //Consumer<Integer>consumer=integer-> System.out.println(integer);
        integers.forEach(integer-> System.out.println(integer));


    }

}
