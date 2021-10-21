package com.company;

import com.company.Classes.Usuario;
import com.company.Classes.Video;
import com.company.Classes.Vizualizacao;

public class Main {

    public static void main(String[] args) {
        Video[] vClipe = new Video[3];
        vClipe[0] = new Video("FEAR. - Kendrick Lamar");
        vClipe[1] = new Video("Chicago Freestyle - Drake");
        vClipe[2] = new Video("I'm Gonna Be - Post Malone");

        Usuario[] user = new Usuario[2];
        user[0] = new Usuario("Marshal Bruce",49,"M","EMINEM");
        user[1] = new Usuario("Calvin Broadus",49,"M","SNOOPDOG");

        Vizualizacao[] watch = new Vizualizacao[5];

        watch[0] = new Vizualizacao(user[0],vClipe[0]);
        watch[0].avaliar();
        System.out.println(watch[0].toString());
        System.out.println("");

        watch[1] = new Vizualizacao(user[0],vClipe[1]);
        watch[1].avaliar(8);
        System.out.println(watch[1].toString());
        System.out.println("");

        watch[2] = new Vizualizacao(user[0],vClipe[2]);
        watch[2].avaliar(50f);
        System.out.println(watch[2].toString());
        System.out.println("");

        watch[3] = new Vizualizacao(user[1],vClipe[0]);
        watch[3].avaliar(10);
        System.out.println(watch[3].toString());
        System.out.println("");

        watch[4] = new Vizualizacao(user[1],vClipe[1]);
        watch[4].avaliar();
        System.out.println(watch[4].toString());
        System.out.println("");


    }
}
