package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.exam.Supplementary;
import com.xworkz.examapp.hallticket.HallTicket;

public class ExamExicouter {
    public static void main(String args[]){

        HallTicket hallTicket =new HallTicket(1,"English","ENG","ABC123","shri");

       Exam exam=new Supplementary();
        exam.fees=1200;
        exam.write(hallTicket);

    Supplementary supplementary=(Supplementary)exam;
    supplementary.write(hallTicket ,1200  );




    }
}
