package com.xworkz.atm_machine.cards.impl;

import com.xworkz.atm_machine.cards.Card;

public class Icici_bank implements Card {
    @Override
    public void swipe() {
        System.out.println("icici bank card is suiped");
    }
}
