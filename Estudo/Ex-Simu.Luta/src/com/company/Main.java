package com.company;

public class Main {

    public static void main(String[] args) {

        Lutador[] combatant = new Lutador[6];

        combatant[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,3,1);
        combatant[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        combatant[2] = new Lutador("Snap Shadow","EUA",35,1.65f,80.9f,12,2,1);
        combatant[3] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        combatant[4] = new Lutador("Nerdaard","EUA",30,1.81f,105.7f,12,2,4);
        combatant[5] = new Lutador("Ufocobol","Brasil",37,1.70f,119.3f,5,4,3);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(combatant[0],combatant[1]);
        UEC01.lutar();
        combatant[0].status();
        combatant[1].status();





        /*
        combatant[0].apresentar();
        combatant[0].status();
        combatant[1].apresentar();
        combatant[1].status();
        combatant[2].apresentar();
        combatant[2].status();
        combatant[3].apresentar();
        combatant[3].status();
        combatant[4].apresentar();
        combatant[4].status();
        combatant[5].apresentar();
        combatant[5].status();
        */

    }
}
