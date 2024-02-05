package com.xworkz.waterfallManagement.repositary;

import com.xworkz.waterfallManagement.dto.Waterfall;

import java.util.List;

public interface WaterRepository {
    public void saveWaterfall(Waterfall waterfall);

    public void saveWaterfall(List<Waterfall> waterfallLisr);
    public Waterfall getWaterfallbyName(int id);



}
