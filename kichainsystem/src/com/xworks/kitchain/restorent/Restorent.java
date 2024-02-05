package com.xworks.kitchain.restorent;

import com.xworks.kitchain.masrer_kitchain.Master_Kitchain;

import java.util.Arrays;

public interface Restorent {






        public boolean addChefs( Master_Kitchain kitchain);
        public void getAllChefs();
        public  String getAddressById(int id);
        public Master_Kitchain getChefsInfoById(int id);


        public String getPostByName(String name);
        public  String getPostNmaeById(int id);
        public boolean updatePostnameByName(String updatedPost ,String name);

        public void deleateChefById(int id);
        public void getnewChefslist(Master_Kitchain[]officers);

    }




