package com.xworkz.java8;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor

@ToString
public class EmployDTO {
    private int employId;
    private String employName;
    private String department;
    private  Double salary;
}
