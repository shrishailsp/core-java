package com.xworkz.collections.cycal;

import lombok.*;

@NoArgsConstructor
@ToString
@Setter
@Getter
@AllArgsConstructor
public class Cycal implements Comparable<Cycal> {
private Integer id;
private String name;
private String price;

    @Override
    public int compareTo(Cycal cycal) {
        return this.id-cycal.id;
    }
}
