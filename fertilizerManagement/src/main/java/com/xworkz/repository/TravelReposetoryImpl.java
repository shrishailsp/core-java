package com.xworkz.repository;

import com.xworkz.entity.TravelEntity;

import javax.persistence.*;

public class TravelReposetoryImpl  implements TravelReposetory{
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer haveFun(TravelEntity entity) {
       EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            System.out.println("etbegins");
            et.begin();
            System.out.println("persistance starts");
            em.persist(entity);
            et.commit();
            System.out.println("commiting transattion");
        }
        catch (PersistenceException pe)
        {
            System.err.println(pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("closing reources");
            em.close();
        }


        return null;
    }
}
