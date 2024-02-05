package com.xworks.kitchain;

import com.xworks.kitchain.masrer_kitchain.Master_Kitchain;
import com.xworks.kitchain.restorent.Restorent;
import com.xworks.kitchain.restorent.impl.BigKitchain;

import java.util.Scanner;

public class RestorentExi {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        Restorent rest = new BigKitchain(size);

        for (int index = 0; index < size; index++) {


            Master_Kitchain kitchain = new Master_Kitchain();


            System.out.println("enter the officer name");
            kitchain.setChefName(sc.next());
            System.out.println("enter thr post");
            kitchain.setPost(sc.next());
            System.out.println("enter the officer address");
            kitchain.setAddress(sc.next());


            rest.addChefs(kitchain);
        }
        rest.getAllChefs();

//        System.out.println("enter getAddressByid");
//        String off = rest.getAddressById(sc.nextInt());
//        System.out.println(off);
//        System.out.println("enter getOfficerInfoById");
//        Master_Kitchain master= rest.getChefsInfoById(sc.nextInt());
//        System.out.println(master.getChefId()+" "+
//                          master.getChefName()+" "+
//                          master.getPost()+" "+
//                          master.getAddress());
//
//        System.out.println("enter getPostNameBy name");
//        String post =rest.getPostByName(sc.next());
//        System.out.println(post);
//
//        System.out.println("getPostNmaeById");
//        String id= rest.getPostNmaeById(sc.nextInt());
//        System.out.println(id);
//        System.out.println("updatePostnameByName  enter new post name and officer name");
//        boolean update=rest.updatePostnameByName(sc.next(),sc.next());
//        rest.getAllChefs();
//        System.out.println("deleateOfficerById");
//        rest.deleateChefById(sc.nextInt());
//
//


        String input=null;
        do {
            System.out.println("press 1:to get all all chefs");
            System.out.println("press 2: to get  post name by id");
            System.out.println("press 3: to get address by id");

            int option= sc.nextInt();
            switch (option){
                case 1:rest.getAllChefs();
                break;
                case 2:
                    System.out.println(" enter id eto get postname ");
                    String nmae= rest.getPostNmaeById(sc.nextInt());
                    System.out.println(nmae);
                    break;
                case 3:
                     System.out.println("enter getAddressByid");
                    String add = rest.getAddressById(sc.nextInt());
                    System.out.println(add);
                    break;
                default:
                    System.out.println("invalid input");


            }
            System.out.println("do you want to continue  yes/no");
            input=sc.next();
        }
while (input.equals("yes"));
        System.out.println("think you for visiting");
    }

    }

