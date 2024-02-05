package com.xworkz.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployTester {
    public static void main(String[] args) {
        List<EmployDTO>employ= Arrays.asList(new EmployDTO(1,"baba","non it",100000.00),
                new EmployDTO(2,"shreegand","it",70000.00),
        new EmployDTO(4,"lalu","marketing",60000.00),
                new EmployDTO(3,"prakash","testing",80000.00));

//        System.out.println(employ.stream()
//                .sorted(Comparator.comparing(EmployDTO::getEmployName))
//                .collect(Collectors.toList()));
//        System.out.println(employ.stream().
//                max(Comparator.comparing(EmployDTO::getSalary))
//                .get());
//        employ.stream().sorted((o1, o2) -> o1.getEmployName().compareTo(o2.getEmployName()))
//                .forEach(System.out::println);
//        employ.stream().sorted(((o1, o2) ->(int)(o1.getSalary().compareTo(o2.getSalary())) ))
//                .forEach(System.out::println);
//        employ.stream().sorted((o1, o2) -> o1.getDepartment().compareTo(o1.getDepartment()))
//                .forEach(System.out::println);
//        System.out.println(employ.stream().sorted((o1, o2) -> o1.getDepartment().compareTo(o1.getDepartment()))
//                .findFirst());

//        System.out.println(  employ.stream().sorted(Comparator.comparing(EmployDTO::getSalary)).findFirst());
        System.out.println(  employ.stream().sorted(Comparator.comparing(EmployDTO::getSalary).reversed()).skip(1).findFirst());
    }
    }
