package com.xworkz.examapp.hallticket;

public class HallTicket {
   public  int id;
    String subName;
    String subCode;
    String usncode;
    String condidateName;
    public HallTicket(int id,String subName,String subCode,String usncode,String condidateName){
        this.id= id;
        this.subName=subName;
        this.subCode=subCode;
        this.usncode=usncode;
        this.condidateName=condidateName;
    }
    public void displayDetails(){
        System.out.println("condidate is is"+this.id);
        System.out.println("condidate subCode is "+this.subCode);
        System.out.println("condidate subName is "+this.subName);
        System.out.println("condidate usncode is "+this.usncode);
        System.out.println("condidate condidateName is "+this.condidateName);


    }
}
