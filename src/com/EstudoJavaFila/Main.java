package com.EstudoJavaFila;

public class Main {

    public static void main(String[] args) {

        //Criação
        Vetor vetor = new Vetor(10);

        //Adicionar na pŕoxima posição
        vetor.adicionar("Eminem");//0
        vetor.adicionar("Mano Brown");//1
        vetor.adicionar("Drake");//2

        //Mostrar tamanho ocupadp
        System.out.println(vetor.getTamanho());

        //Imprimir na tela posições ocupadas
        System.out.println(vetor.toString());

        //Buscar e imprimir na tela a posição requerida
        System.out.print("Elemento na posição 3: ");
        System.out.println(vetor.buscarPorPosicao(2));
        //System.out.print("Este elemento da Erro por causa da posição que está NULL: ");
        //System.out.println(vetor.buscarPorPosicao(4));

        //Buscar elemento
        System.out.println(vetor.buscarElemento("eminem"));//retorna a posição onde foi encontrado
        System.out.println(vetor.buscarElemento("Post Malone"));//retorna -1 porque não achou

        //Adicionar elemento em qualquer posição
        vetor.addNaPosicao(0,"Snoop Dog");

        //Imprimir na tela posições ocupadas
        System.out.println(vetor.toString());






    }
}
