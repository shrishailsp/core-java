package com.xworkz.repository;

import com.xworkz.entity.TempleEntity;
import com.xworkz.entity.TravelEntity;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public interface TempleRepository {
    void save(TempleEntity entity);
    default void saveAll (List<TempleEntity> entities){

        }
     default    List<TempleEntity> findAllByLocation (String name){
        return Collections.emptyList();
    }

 default    List<TempleEntity> findAllbyFeeGraterThen (int fee) {
        return Collections.emptyList();
 }


default List<TempleEntity> findAllByEntryBEtween (int startfee ,int endfee){
        return Collections.emptyList();
}


    default List<TempleEntity> findAlByInogrationDateGraterThen (LocalDate date){
    return Collections.emptyList();
}
    default List<TempleEntity> findAllByMainGodAndLocation (String mainGod,String location){
        return Collections.emptyList();
    }

    default TempleEntity findById(int id){
    return null;
    }
    default  TempleEntity findByIdAndMainGod(int id,String maingod){
        return null;

    }

    default  Long FindTotal(){
        return null;
    }


    default  void  updatelocationByName(String location ,String name){


    }

    default  void  updateEntryFeeyName(double fee ,String name){


    }

    default  void  updateByName(String location ,String name){


    }
    default  void  updateAllVipEntres(boolean entry ,List<Integer> list){


    }
    default  void  deleateByName(String name){


    }



}

