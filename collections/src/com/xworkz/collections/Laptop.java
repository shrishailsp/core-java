package com.xworkz.collections;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Laptop implements Comparable<Laptop>{
    private Integer id;
    private String name;
    private String price;


    @Override
    public int compareTo(Laptop laptop)
    {
        return this.id -laptop.id;
    }
}
