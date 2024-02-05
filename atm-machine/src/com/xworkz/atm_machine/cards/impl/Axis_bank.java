package com.xworkz.atm_machine.cards.impl;

import com.xworkz.atm_machine.cards.Card;

public class Axis_bank implements Card {
    @Override
    public void swipe() {
        System.out.println("Axis bank card is swiped");
    }
}
