package com.xworkz.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilteringString {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("moutain");
        list.add("Bandipur");
        list.add("Dandeli");
        list.add("Kabini");
        list.add("Nagaraholley");
        list.add("Banneugatta");
        list.add("Subdarban");

       //Predicate<String>filtaredout= filtered ->filtered.startsWith("B");

        List<String> output=list.stream().filter(filtered->filtered.startsWith("B")).collect(Collectors.toList());
        System.out.println(output);
    }
}
class FindOddAndEven{
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(34);
        list.add(65);
        list.add(67);
        list.add(87);
        list.add(56);
        list.add(33);
        list.add(90);
        List<Integer> output=list.stream().filter(l->l%2==0).collect(Collectors.toList());
        System.out.println("even num"+output);



    }
}
