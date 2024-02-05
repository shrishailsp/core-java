package com.xworkz.atm_machine.cards.impl;

import com.xworkz.atm_machine.cards.Card;

public class Idbi_bank implements Card {
    @Override
    public void swipe() {
        System.out.println("idbi bank card is suiped");
    }
}
