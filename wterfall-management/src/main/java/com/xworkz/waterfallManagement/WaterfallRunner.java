package com.xworkz.waterfallManagement;

import com.xworkz.waterfallManagement.dto.Waterfall;
import com.xworkz.waterfallManagement.repositary.WaterRepository;
import com.xworkz.waterfallManagement.repositary.WaterfallRepositoryImpl;
import com.xworkz.waterfallManagement.service.WaterfallService;
import com.xworkz.waterfallManagement.service.WaterfallserviceImpl;

import java.util.ArrayList;
import java.util.List;

public class WaterfallRunner {
    public static void main(String[] args) {
       // WaterRepository waterRepository=new WaterfallRepositoryImpl();
        WaterfallService waterfallService=new WaterfallserviceImpl();
       Waterfall waterfall=new Waterfall("Aagomba","shivamogga","kaveri","karnataka");
       Waterfall waterfall1=new Waterfall("kali","belgav","krishna","karnataka");
       //waterRepository.saveWaterfall(waterfall);
       // waterfallService.validateAndSaveWaterfall(waterfall);
        List<Waterfall> waterfallList=new ArrayList<>();
        waterfallList.add(waterfall);
        waterfallList.add(waterfall1);
        waterfallService.validateAndSavewaterfall(waterfallList);

//waterfallService.validateAndGetName(1);
    }
}
