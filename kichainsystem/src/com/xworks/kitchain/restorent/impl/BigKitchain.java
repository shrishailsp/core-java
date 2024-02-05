package com.xworks.kitchain.restorent.impl;

import com.xworks.kitchain.masrer_kitchain.Master_Kitchain;
import com.xworks.kitchain.restorent.Restorent;

public class BigKitchain implements Restorent {
    Master_Kitchain kitchain[];
    int index;
    int rouff;
    public BigKitchain(int size){
        kitchain =new Master_Kitchain [size];



    }
    @Override
    public boolean addChefs(Master_Kitchain kitchain) {
        return false;
    }

    @Override
    public void getAllChefs() {

    }

    @Override
    public String getAddressById(int id) {
        return null;
    }

    @Override
    public Master_Kitchain getChefsInfoById(int id) {
        return null;
    }

    @Override
    public String getPostByName(String name) {
        return null;
    }

    @Override
    public String getPostNmaeById(int id) {
        return null;
    }

    @Override
    public boolean updatePostnameByName(String updatedPost, String name) {
        return false;
    }

    @Override
    public void deleateChefById(int id) {

    }

    @Override
    public void getnewChefslist(Master_Kitchain[] officers) {

    }
}
