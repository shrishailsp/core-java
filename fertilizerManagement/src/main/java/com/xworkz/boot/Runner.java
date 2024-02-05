package com.xworkz.boot;

import com.xworkz.entity.FertilizerEntity;
import com.xworkz.repository.FertilizerRepository;
import com.xworkz.repository.FetilizerRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        FertilizerEntity fertilizerEntity1=new FertilizerEntity("zinc",20,388, LocalDate.of(2012,2,3),LocalDate.of(2020,3,4));
        FertilizerEntity fertilizerEntity2=new FertilizerEntity("sodium",20,1200, LocalDate.of(2029,2,3),LocalDate.of(2020,3,4));
        FertilizerEntity fertilizerEntity3=new FertilizerEntity("potium",20,800, LocalDate.of(2029,2,3),LocalDate.of(2020,3,4));
        FertilizerEntity fertilizerEntity4=new FertilizerEntity("urea",20,500, LocalDate.of(30,2,3),LocalDate.of(2020,3,4));
        FertilizerEntity fertilizerEntity5=new FertilizerEntity("ppa",20,600, LocalDate.of(2012,2,3),LocalDate.of(2020,3,4));
   FertilizerRepository repo= new  FetilizerRepositoryImpl();
//        repo.save(fertilizerEntity);

        List<FertilizerEntity> entities= Arrays.asList(fertilizerEntity1,fertilizerEntity2,fertilizerEntity3,fertilizerEntity4,fertilizerEntity5);
    repo.saveAll(entities);

//       List<FertilizerEntity> list= repo.findAllBtQuantity(20);
//       list.forEach(f-> System.out.println(f));
    }
}
