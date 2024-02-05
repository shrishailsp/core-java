package com.xworkz.repository;

import com.xworkz.entity.FertilizerEntity;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface FertilizerRepository {


    Integer save (FertilizerEntity entity);

     default void saveAll(List<FertilizerEntity> list)
    {

    }
    default  List<FertilizerEntity> findAllBtQuantity(int quantity){
         return Collections.EMPTY_LIST;
    }
}
