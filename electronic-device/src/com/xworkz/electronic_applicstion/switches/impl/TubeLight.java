package com.xworkz.electronic_applicstion.switches.impl;

import com.xworkz.electronic_applicstion.switches.Switch;

public class TubeLight implements Switch {


    @Override
    public void on() {
        System.out.println("tube light is turned onn....");

    }

    @Override
    public void off() {
        System.out.println("tube light is turned off....");


    }
}
