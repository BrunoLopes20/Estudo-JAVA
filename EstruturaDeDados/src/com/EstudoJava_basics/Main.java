package com.EstudoJava_basics;

public class Main {

    public static void main(String[] args) {

        //Criando e inicialziando o vetor
        Vetor v = new Vetor(10);

        //adicionando elementos no vetor
        v.adicionar("BOLA");
        v.adicionar("LÁPIS");
        v.adicionar("LIVRO");
        v.adicionar("PAPEL");
        v.adicionar("FONE");

        //saber o tamanho do vetor
        System.out.println(v.getTamanho());


    }
}
