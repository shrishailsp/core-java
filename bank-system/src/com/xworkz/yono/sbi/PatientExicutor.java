package com.xworkz.yono.sbi;

public class PatientExicutor {
    public static void main(String[] args) {
        Patient  patient1=new Patient();
        patient1.setId(1);
        patient1.setName("om");
        patient1.setAddress("rrNagar");
        patient1.setAge(50);
        System.out.println(patient1);

    Patient  patient=new Patient();
        patient.setId(2);
        patient.setName("shri");
        patient.setAddress("rajaji nagar");
        patient.setAge(47);
        System.out.println(patient);

        Patient  patient2=new Patient();
        patient2.setId(3);
        patient2.setName("shreegandh");
        patient.setAddress("electronic city");
        patient2.setAge(45);
        System.out.println(patient2);


        Patient  patient3=new Patient();
        patient3.setId(4);
        patient3.setName("akash");
        patient3.setAddress("shivnagar");
        patient3.setAge(65);
        System.out.println(patient3);


        Patient  patient4=new Patient();
        patient4.setId(5);
        patient4.setName("daya");
        patient4.setAddress("nandini layout");
        patient4.setAge(36);
        System.out.println(patient4);

        Patient  patient5=new Patient();
        patient5.setId(6);
        patient5.setName("ranna");
        patient5.setAddress("shivaji nagar");
        patient5.setAge(53);
        System.out.println(patient5);
    }
}

