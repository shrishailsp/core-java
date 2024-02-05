package com.xworkz.boot;

import com.xworkz.entity.TravelEntity;
import com.xworkz.repository.TravelReposetory;
import com.xworkz.repository.TravelReposetoryImpl;

public class TeavelRunner {
    public static void main(String[] args) {
        TravelEntity travelEntity=new TravelEntity(1,"vijaypur","ayoudhya","20000","1000","to meet ram","by train","2024-03-21","2024-03-30");
        TravelReposetory reposetory=new TravelReposetoryImpl();
        reposetory.haveFun(travelEntity);
    }
}
