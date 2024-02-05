package com.xworkz.repository;

import com.xworkz.entity.EmailEntity;

import javax.persistence.*;

public class EmailRepositoryImpl implements EmailReposetory {
   EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");


    @Override
    public Integer save(EmailEntity entity) {
        EntityManager em = this.emf.createEntityManager();
       EntityTransaction et= em.getTransaction();
       try {
           System.out.println("et begins");
           et.begin();
           System.out.println("persistence begins");
           em.persist(entity);
           System.out.println("completed");
           et.commit();
       }
       catch (PersistenceException pe)
       {
           System.err.println("persistanceExpection in save method of email "+pe.getMessage());
                   et.rollback();
       }
finally {
           System.out.println("closing resource");
           em.close();
       }

        return null;
    }
}
