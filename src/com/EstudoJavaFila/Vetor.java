package com.EstudoJavaFila;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    //Construct
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
// ** Método menos eficaz

//    public void adicionar(String elementoAdd){
//        for(int i=0 ; i<this.elementos.length ; i++){
//            if(this.elementos[i]==null){
//                this.elementos[i] = elementoAdd;
//                break;
//            }
//        }
//    }

// ** Método utilizando Exception
//    public void adicionar(String elementoAdd) throws Exception {
//        if (this.tamanho < this.elementos.length) {
//            this.elementos[this.tamanho] = elementoAdd;
//            this.tamanho++;
//        } else {
//                   throw new Exception("O vetor está cheio !");
//        }
//    }

//** Método retornando um Boolean
    public boolean adicionar(String elementoAdd) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elementoAdd;
            this.tamanho++;
            System.out.println("ADD");
            return true;
        }
        System.out.println("N ADD");
        return false;
    }

    //GET
    public int getTamanho(){
        return this.tamanho;
    }

    //Imprimir os elementos preenchidos do vetor
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i<this.tamanho-1;i++){
            s.append(this.elementos[i]);
            s.append(",");
        }
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");

        return s.toString();

    }


    //Buscar elemento do vetor
    public String buscarPorPosicao(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    //Buscar se o elemento existe no vetor
    public int buscarElemento(String elementoProcurado){
        //Busca linear
        for(int i=0;i<this.tamanho;i++) {
            if (this.elementos[i].equalsIgnoreCase(elementoProcurado)) {
                return i;
            }
        }
        return -1;//posição que não existe
    }

    //Adicionar elemento em qualquer posição
    public void addNaPosicao(int posicao, String elemento){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = tamanho - 1; i>=posicao;i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        tamanho++;
    }




}
