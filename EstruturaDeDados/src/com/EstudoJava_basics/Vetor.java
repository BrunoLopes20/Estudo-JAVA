package com.EstudoJava_basics;

public class Vetor {

    private String[] elementos;
    private int tamanho;//tamanho real de elementos dentro do array


    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //adiciona um elemento no final da fila
    public boolean adicionar(String elemento){
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i=0; i <this.elementos-1; i++){
            s.append(this.elementos[i]);
            s.append(",");
        }
        if(this.tamanho>0) {
            s.append(this.elementos[this.tamanho - 1]);}
        s.append("]");
        return null;
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
