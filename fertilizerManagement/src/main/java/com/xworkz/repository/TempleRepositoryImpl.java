package com.xworkz.repository;

import com.xworkz.entity.TempleEntity;
import com.xworkz.entity.TravelEntity;
import com.xworkz.util.EmfUtil;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TempleRepositoryImpl implements TempleRepository{
    EntityManagerFactory emf= EmfUtil.getEntitymanager();
    @Override
    public void save(TempleEntity entity) {
       EntityManager em= emf.createEntityManager();
      EntityTransaction et= em.getTransaction();
      try {
          System.out.println("et bigens");
          et.begin();
          System.out.println("persist started");
          em.persist(entity);
          System.out.println("commiting persist");
          et.commit();
          System.out.println("entity addae successfully");

      }

      catch (PersistenceException pe)
      {
          System.out.println(pe.getMessage());
      }
      finally {
          System.out.println("closing resources");
          em.close();
      }
    }
    @Override
    public void saveAll (List<TempleEntity> entities){
    EntityManager em= this.emf.createEntityManager();
   EntityTransaction et= em.getTransaction();
   try {
       System.out.println("et begins");
       et.begin();
      entities.forEach(e->em.persist(e));
       System.out.println("data inserted successfully");
     // et.commit();


   }
   catch (PersistenceException pe)

   {
       System.out.println(pe.getMessage());
       et.rollback();

   }
   finally {
       System.out.println("closing resources");
       em.close();
   }
    }
    public  List<TempleEntity> findAllByLocation (String name) {
       EntityManager em= emf.createEntityManager();
             EntityTransaction et=   em.getTransaction();
             try {
                 et.begin();
              Query query=   em.createNamedQuery("findAllByLocation");
                 query.setParameter("lo",name);
                  List<TempleEntity> list=query.getResultList();
                  return list;
             }
        catch (PersistenceException pe){
            System.out.println(pe.getMessage());
        }
             finally {
                 System.out.println("closing  resources");
                 em.close();
             }
        return Collections.emptyList();
    }

    public    List<TempleEntity> findAllbyFeeGraterThen (int fee) {
       EntityManager em= emf.createEntityManager();
        EntityTransaction et=   em.getTransaction();
        try {
            et.begin();
            Query query=   em.createNamedQuery("graterthen");
            query.setParameter("value",fee);
            List<TempleEntity> list=query.getResultList();
            return list;
        }
        catch (PersistenceException pe){
            System.out.println(pe.getMessage());
        }
        finally {
            System.out.println("closing  resources");
            em.close();
        }
        return Collections.emptyList();
    }
    public List<TempleEntity> findAllByEntryBEtween (int startfee ,int endfee){
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=   em.getTransaction();
        try {
            et.begin();
            Query query=   em.createNamedQuery("between");
            query.setParameter("startFee",startfee);
            query.setParameter("endFee",endfee);
            List<TempleEntity> list=query.getResultList();
            return list;
        }
        catch (PersistenceException pe){
            System.out.println(pe.getMessage());
        }
        finally {
            System.out.println("closing  resources");
            em.close();
        }
        return Collections.emptyList();
    }

    public List<TempleEntity> findAlByInogrationDateGraterThen (LocalDate date){
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=   em.getTransaction();
        try {
            et.begin();
            Query query=   em.createNamedQuery("date");
            query.setParameter("current",date);

            List<TempleEntity> list=query.getResultList();
            return list;
        }
        catch (PersistenceException pe){
            System.out.println(pe.getMessage());
        }
        finally {
            System.out.println("closing  resources");
            em.close();
        }
        return Collections.emptyList();
    }
    public List<TempleEntity> findAllByMainGodAndLocation (String mainGod,String location){
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=   em.getTransaction();
        try {
            et.begin();
            Query query=   em.createNamedQuery("bygodandlocation");
            query.setParameter("find",mainGod);
            query.setParameter("findlocarion",location);
            List<TempleEntity> list=query.getResultList();
            return list;
        }
        catch (PersistenceException pe){
            System.out.println(pe.getMessage());
        }
        finally {
            System.out.println("closing  resources");//notgetting output
            em.close();
        }
        return Collections.emptyList();
    }
    public TempleEntity findById(int id){
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=   em.getTransaction();
        try {
            et.begin();
         Query query= em.createNamedQuery("findbyid");
          query.setParameter("id",id);
         List<TempleEntity>list= query.getResultList();
         list.forEach(e-> System.out.println(e));

        }
        catch (PersistenceException pe){
            System.out.println(pe.getMessage());
        }
        finally {
            System.out.println("closing  resources");
            em.close();
        }

        return null;
    }

    public   TempleEntity findByIdAndMainGod(int id,String maingod){
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=   em.getTransaction();
        try {
            et.begin();
            Query query= em.createNamedQuery("findByIdandMainGod");
            query.setParameter("findid",id);
            query.setParameter("findGod",maingod);
            List<TempleEntity>list= query.getResultList();
            list.forEach(e-> System.out.println(e));

        }
        catch (PersistenceException pe){
            System.out.println(pe.getMessage());
        }
        finally {
            System.out.println("closing  resources");
            em.close();
        }

        return null;

    }
    public   Long FindTotal(){

        return null;
    }
    public   void  updatelocationByName(String name){
    EntityManager em=emf.createEntityManager();
     EntityTransaction et= em.getTransaction();
//     try {
//         et.begin();
//         System.out.println("et begins");
//        Query query= em.createNamedQuery("updateLocation");
//        query.setParameter("");
//
//     }


    }

}
