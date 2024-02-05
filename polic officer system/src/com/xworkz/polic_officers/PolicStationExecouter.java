package com.xworkz.polic_officers;

import com.xworkz.polic_officers.officers.Officer;
import com.xworkz.polic_officers.policStation.PolicStation;
import com.xworkz.polic_officers.policStation.impl.RajajiNagarImpl;

import java.util.Scanner;

public class PolicStationExecouter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        PolicStation policStation=new RajajiNagarImpl(size);

        for (int index = 0; index < size; index++) {


        Officer officers =new Officer();
        System.out.println("enter the officer id");
officers.setId(sc.nextInt());
        System.out.println("enter the officer name");
officers.setName(sc.next());
        System.out.println("enter the officer gender");
officers.setGender(sc.next());
        System.out.println("enter thr post");
officers.setPost(sc.next());
        System.out.println("enter the officer address");
officers.setAddress(sc.next());
        System.out.println("enter the age of officer");
officers.setAge(sc.nextInt());
        System.out.println("enter  the blood group of the officer");
officers.setBloodGroup(sc.next());


        policStation.addofficers(officers);
        }

        policStation.getAllOfficers();

        System.out.println("enter getAddressByid");
     String off = policStation.getAddressById(sc.nextInt());
       System.out.println(off);
        System.out.println("enter getOfficerInfoById");
     Officer polic=   policStation.getOfficerInfoById(sc.nextInt());
        System.out.println(polic.getId()+" "+polic.getAge()+"  "+
                polic.getName()+" "+polic.getPost()+" "+
                polic.getGender()+" "+polic.getBloodGroup()+" "+
                polic.getAddress());

        System.out.println("enter getPostNameBy name");
         String post =policStation.getPostByName(sc.next());
        System.out.println(post);
        System.out.println("enter getOfficerAgeByName ");
      int age=  policStation.getOfficerAgeByName(sc.next());
        System.out.println(age);
        System.out.println("getPostNmaeById");
       String id= policStation.getPostNmaeById(sc.nextInt());
        System.out.println(id);
        System.out.println("updatePostnameByName  enter new post name and officer name");
        boolean update=policStation.updatePostnameByName(sc.next(),sc.next());
        policStation.getAllOfficers();
        System.out.println("deleateOfficerById");
        policStation.deleateOfficerById(sc.nextInt());
 }


}
