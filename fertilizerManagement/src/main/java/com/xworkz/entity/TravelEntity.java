package com.xworkz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Travel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelEntity {

    //Id, source, destination, budget, distance, purpose, modeType, date, returnDate
    @Id
    @Column(name = "Id")
    private int id;
    private String source;
    private  String destination;
    private  String budget;
    private  String distance;
    private String purpose;
    private String modeType;
    private String date;
    private  String returnDate;

}
