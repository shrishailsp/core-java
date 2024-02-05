package com.xworkz.boot;

import com.xworkz.entity.TempleEntity;

import com.xworkz.repository.TempleRepository;
import com.xworkz.repository.TempleRepositoryImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class TempleRunner {
    public static void main(String[] args) {
      //  TempleEntity templeEntity=new TempleEntity(0,"ramMandir","Ayodhya",200,500, LocalDate.of(2024,1,22),"LordRam");
     TempleRepository templeRepository= new TempleRepositoryImpl();
    // templeRepository.save(templeEntity);

        TempleEntity templeEntity=new TempleEntity("ramMandir","Ayodhya",200,500, LocalDate.of(2024,1,22),"LordRam");
        TempleEntity templeEntity1=new TempleEntity("kaashi","aranasi",200,500, LocalDate.of(2022,1,22),"Lordshiva");
        TempleEntity templeEntity2=new TempleEntity("krishna","mathura",300,1000, LocalDate.of(2001,1,22),"Lordkrishana");
        TempleEntity templeEntity3=new TempleEntity("maramma","bng",300,600, LocalDate.of(2000,1,22),"Lordkali");
        List<TempleEntity> list= Arrays.asList(templeEntity,templeEntity2,templeEntity3,templeEntity1);
       templeRepository.saveAll(list);

     // List<TempleEntity> list1=  templeRepository.findAllByLocation("Ayodhya");
       // list1.forEach(e-> System.out.println(e));

      //List<TempleEntity> list2=  templeRepository.findAllbyFeeGraterThen(200);
       //list2.forEach(f-> System.out.println(f));

//       List<TempleEntity>list3= templeRepository.findAllByEntryBEtween(300,1000);
//        list3.forEach(b-> System.out.println(b));


       //List<TempleEntity> list4= templeRepository.findAlByInogrationDateGraterThen(LocalDate.of(2022,01,21));
//        list4.forEach(e-> System.out.println(e));

       List<TempleEntity>list5= templeRepository.findAllByMainGodAndLocation("Lordkali","bng");
        list5.forEach(e-> System.out.println(e));

//      TempleEntity templeEntity4=  templeRepository.findById(1);
//        System.out.println(templeEntity4);

//
//    TempleEntity templeEntity6= templeRepository.findByIdAndMainGod(1,"LordRam");
//        System.out.println(templeEntity6);


   }
}
