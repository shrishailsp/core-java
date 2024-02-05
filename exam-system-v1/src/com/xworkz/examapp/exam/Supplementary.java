package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class Supplementary extends Exam {
    public int noOfAttempts=2;


   @Override
    public boolean write(HallTicket ticket) {
        if (noOfAttempts > 1) {
            System.out.println("supplementry exam invoked");
            return super.write(ticket);

        }
        return true;
    }
   public void write(HallTicket ticket,int fees){
        System.out.println(fees);
    }
}
