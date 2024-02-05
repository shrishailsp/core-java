package com.xworkz.polic_officers.policStation.impl;

import com.xworkz.polic_officers.officers.Officer;
import com.xworkz.polic_officers.policStation.PolicStation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RajajiNagarImpl implements PolicStation {
    Officer officers[];

    int index;
    public RajajiNagarImpl(int size){
        officers =new Officer[size];


    }

    public boolean addofficers(Officer officers){
        boolean isAdded = false;
        if(officers!=null){
            this.officers[index++]=officers;
            isAdded=true;
        }
        return isAdded;
    }
    public void getAllOfficers(){
        for (int index = 0; index <officers.length ; index++) {
            System.out.println(officers[index].getId()+" "+
                    officers[index].getName()+" "+
                    officers[index].getAge()+" "+
                    officers[index].getGender()+" "+
                    officers[index].getAddress()+" "+
                    officers[index].getBloodGroup()+" "+
                    officers[index].getPost());



        }
    }
    public  String getAddressById(int id){

        String policid=null;
//        for (int index = 0; index < officers.length; index++) {
//            if(officers[index].getId()==id){
//                policid=officers[index].getAddress();
//            }
//
//        }

        return policid;
    }
    public Officer getOfficerInfoById(int id){
        Officer off=null;
        for (int index = 0; index < officers.length; index++) {
            if(officers[index].getId()==id){
                off=officers[index];
            }

        }
        return off;
    }
    public int getOfficerAgeByName(String name){
        int age=0;
        for (int index = 0; index < officers.length; index++) {
            if(officers[index].getName()==name){
                age=officers[index].getAge();
            }

        }
        return age;
    }
    public String getPostByName(String name){

        for (int index = 0; index < officers.length; index++) {
            if(officers[index].getName()==name){
                return officers[index].getPost();

            }

        }
        return null;
    }
    public  String getPostNmaeById(int id){
        String post=null;
        for (int index = 0; index < officers.length; index++) {
            if(officers[index].getId()==id){
                post=officers[index].getPost();
            }

        }
        return post;
    }
    public boolean updatePostnameByName(String updatedPost ,String name){
        boolean isAdded=false;
        for (int index = 0; index < officers.length; index++) {
            if(officers[index].getName()==name){
                officers[index].setPost(updatedPost);
                isAdded=true;
            }
        }
        return isAdded;

    }

    public void deleateOfficerById(int id){
        int index,newindex;
        for ( index=0,newindex=0; index <officers.length ; index++) {
            if(officers[index].getId()!=id){
                officers[newindex]=officers[index];

            }
            else{
                System.out.println("given officer is suspended");


            }

        }
        officers= Arrays.copyOf(officers,newindex);
    }
    public void getnewOfficerslist(Officer[]officers){
        System.out.println("new officers list");
        for (int index = 0; index < officers.length; index++) {
            System.out.println(officers[index].getId()+""+
                    officers[index].getName()+""+
                    officers[index].getAge()+""+
                    officers[index].getGender()+""+
                    officers[index].getPost()+""+
                    officers[index].getBloodGroup());

        }
    }

}




