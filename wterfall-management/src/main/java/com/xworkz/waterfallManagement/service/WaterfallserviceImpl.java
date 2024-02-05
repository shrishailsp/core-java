package com.xworkz.waterfallManagement.service;

import com.xworkz.waterfallManagement.dto.Waterfall;
import com.xworkz.waterfallManagement.repositary.WaterRepository;
import com.xworkz.waterfallManagement.repositary.WaterfallRepositoryImpl;

import java.util.List;

public class WaterfallserviceImpl implements  WaterfallService {

WaterRepository waterRepository=new WaterfallRepositoryImpl();
    @Override
    public void validateAndSaveWaterfall(Waterfall waterfall) {
        if(waterfall.getName()!=null&&waterfall.getRiver_name()!=null){
            waterRepository.saveWaterfall(waterfall);
        }else{
            System.out.println("please give valid name or river_name.................");
        }


    }

    @Override
    public void validateAndSavewaterfall(List<Waterfall> waterfallList) {
        waterRepository.saveWaterfall(waterfallList);
    }

    @Override
    public Waterfall validateAndGetName(int id) {
        if(id!=0){
            Waterfall water=
            waterRepository.getWaterfallbyName(id);
            System.out.println(water.getRiver_name());
            System.out.println(water.getPlace());
            System.out.println(water.getState());
            System.out.println(water.getName());
            return water;
        }else {
            System.out.println("please provide correct name");
        }
        return null;
    }

}

