package com.xworkz.waterfallManagement.dto;

public class Waterfall {
    private int id;
    private  String name;
    private String place;
    private String river_name;
    private String state;

    public Waterfall(){


    }



    public Waterfall(String name, String place, String river_name, String state ){
     this.name=name;
     this.place=place;
     this.river_name=river_name;
     this.state=state;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getRiver_name() {
        return river_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRiver_name(String river_name) {
        this.river_name= river_name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
