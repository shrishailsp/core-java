package com.xworkz.boot;

import com.xworkz.entity.EmailEntity;
import com.xworkz.repository.EmailReposetory;
import com.xworkz.repository.EmailRepositoryImpl;

public class EmailRunner {
    public static void main(String[] args) {
        EmailEntity emailEntity=new EmailEntity(1,"abc@gmail.com","shrishail","shree","xwokz@gmail","xworkz@gmail.com","shreegandh@gmail.com");
        EmailReposetory reposetory= new  EmailRepositoryImpl();
        reposetory.save(emailEntity);
    }
}
