package com.xwokkz.appolo.patient;




public class PatientExecouter {
    public static void main(String[] args) {
        Patient patient=new Patient();
        patient.setId(1);
        patient.setAge(25);
        patient.setName("prakash");
        patient.setGender("male");
        patient.setPurpose("heart pain");




               System.out.println("patient id is "+  patient.getId());
        System.out.println("patient age is "+ patient.getAge());
        System.out.println("patient name is "+ patient.getName());
        System.out.println("gender is "+ patient.getGender());
        System.out.println("purpose of admition is "+ patient.getPurpose());
    }
    }




