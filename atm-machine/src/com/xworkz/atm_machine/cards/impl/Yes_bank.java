package com.xworkz.atm_machine.cards.impl;

import com.xworkz.atm_machine.cards.Card;

public class Yes_bank implements Card {
    @Override
    public void swipe() {
        System.out.println("yes bank card is swiped");
    }
}
