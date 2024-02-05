package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public  class Exam {
    HallTicket ticket;
    public int fees;
    public Exam(){


    }
    public boolean write(HallTicket ticket){
        System.out.println("exam class invoked");
        boolean isAllved=false;
        this.ticket=ticket;
        if(fees >=1200){
            System.out.println("fees is paid proside to exam");

            if(ticket!=null){
                System.out.println("issu the hallticket");


                System.out.println("details are avaliable issu the hall ticket ");
                this.ticket.displayDetails();
                isAllved=true;

            }else{
                System.out.println("details not found provide details");
            }
        }else{
            System.out.println("firest pay the fees pleas");
        }
        return isAllved;
    }

}
