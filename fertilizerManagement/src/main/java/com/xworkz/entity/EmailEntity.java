package com.xworkz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "email")
@Data
@AllArgsConstructor@NoArgsConstructor
public class EmailEntity {
   // Id, e_address, E_from, e_to, cc, bcc, sendTo
    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "e_address")
    private String address;
    @Column(name = "E_from")
    private String from;
    @Column(name = "e_to")
    private String to;
    @Column(name = "cc")
    private  String cc;
    @Column(name = "bcc")
    private String bcc;
    @Column(name = "sendTo")
    private String sendTo;
}
