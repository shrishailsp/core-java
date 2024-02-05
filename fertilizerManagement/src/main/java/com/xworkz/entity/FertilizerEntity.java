package com.xworkz.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Fertilizer")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findAllByQuantity",query = "select fe from FertilizerEntity fe where fe.quantity=:find")

//Id, name, quantity, cost, mfgdate, expDate

public class FertilizerEntity {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//saya database will generate id
    private int id;
    @Column(name = "name")
@NonNull
    private String name;
    @Column(name = "quantity")
    @NonNull
    private int quantity;
    @Column(name = "cost")
    @NonNull
    private int cost;
    @Column(name = "mfgdate")
    @NonNull
    private LocalDate mfgDate;
    @Column(name = "expDate")
    @NonNull
    private LocalDate expDate;


}
