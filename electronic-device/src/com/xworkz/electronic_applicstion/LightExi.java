package com.xworkz.electronic_applicstion;

import com.xworkz.electronic_applicstion.switches.Switch;
import com.xworkz.electronic_applicstion.switches.impl.CflBulbs;
import com.xworkz.electronic_applicstion.switches.impl.TubeLight;

public class LightExi {
    public static void main(String[] args) {
       Switch aswitch=new TubeLight();
       aswitch.on();
       aswitch.off();



        Switch switches=new CflBulbs();
        switches.on();

        switches.off();
    }
}
