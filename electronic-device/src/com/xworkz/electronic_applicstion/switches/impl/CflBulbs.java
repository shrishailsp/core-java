package com.xworkz.electronic_applicstion.switches.impl;

import com.xworkz.electronic_applicstion.switches.Switch;

public class CflBulbs implements Switch {



        @Override
        public void on(){
            System.out.println(" cfl is  is turned onn....");


        }
        @Override
        public void off() {
            System.out.println(" cfl is  is turned off....");


        }
    }


