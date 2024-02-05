package com.xworkz.repository;

import com.xworkz.entity.FertilizerEntity;
import com.xworkz.util.EmfUtil;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class FetilizerRepositoryImpl  implements FertilizerRepository{
  private   EntityManagerFactory emf= EmfUtil.getEntitymanager();
    @Override
    public Integer save(FertilizerEntity entity) {
        EntityManager em=this.emf.createEntityManager();
       EntityTransaction et= em.getTransaction();
       try {
           System.out.println("starting et");
           et.begin();
           System.out.println("stariong persuist");
           em.persist(entity);
           System.out.println("persist success");
           et.commit();
           return  entity.getId();

       }
       catch (PersistenceException pe){
           System.err.println("persistanceExpection in save method of fertilizer "+pe.getMessage());
           et.rollback();
       }
       finally {
           System.out.println("closing resources");
           em.close();//me
       }
        return null;
    }

    @Override
    public void saveAll(List<FertilizerEntity> list) {
        EntityManager em =emf.createEntityManager();
       EntityTransaction et= em.getTransaction();
        try {
            et.begin();
            System.out.println("et begins");
            list.forEach(e->em.persist(e));//persist is used to insert only entity we use foreach to loop it
            // et.commit();


        }
        catch (PersistenceException pe)
        {
            System.out.println(pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("closing resourch");
            em.close();
        }
    }
@Override
public List<FertilizerEntity> findAllBtQuantity(int quantity){
    EntityManager em =emf.createEntityManager();
    EntityTransaction et= em.getTransaction();
    try {
        et.begin();
        System.out.println("et begins");
       Query query= em.createNamedQuery("findAllByQuantity");
        query.setParameter("find",quantity);
       List<FertilizerEntity> list= query.getResultList();

        et.commit();
return list;

    }
    catch (PersistenceException pe)
    {
        System.out.println(pe.getMessage());
        et.rollback();
    }
    finally {
        System.out.println("closing resourch");
        em.close();
    }
    return Collections.EMPTY_LIST;

}


}
