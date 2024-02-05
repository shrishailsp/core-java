package com.xworkz.waterfallManagement.service;

import com.xworkz.waterfallManagement.dto.Waterfall;

import java.util.List;

public interface WaterfallService {
    public void validateAndSaveWaterfall(Waterfall waterfall);
    public void validateAndSavewaterfall(List<Waterfall> waterfallList);
    public Waterfall validateAndGetName(int id);


}
