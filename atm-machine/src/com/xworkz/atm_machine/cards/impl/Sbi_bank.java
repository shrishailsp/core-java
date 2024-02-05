package com.xworkz.atm_machine.cards.impl;

import com.xworkz.atm_machine.cards.Card;

public class Sbi_bank implements Card {
    @Override
    public void swipe() {
        System.out.println("sbi card is swiped");
    }
}
