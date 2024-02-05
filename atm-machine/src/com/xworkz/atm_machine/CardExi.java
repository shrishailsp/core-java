package com.xworkz.atm_machine;

import com.xworkz.atm_machine.cards.Card;
import com.xworkz.atm_machine.cards.impl.*;

public class CardExi {
    public static void main(String[] args) {
        Card card=new Sbi_bank();
        card.swipe();

        Card card1=new Axis_bank();
        card1.swipe();

        Card card2=new Icici_bank();
        card2.swipe();

        Card card3=new Yes_bank();
        card3.swipe();
        Card card4=new Idbi_bank();
        card4.swipe();
    }
}
