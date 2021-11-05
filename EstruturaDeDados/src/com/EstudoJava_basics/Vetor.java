package com.EstudoJava_basics;

public class Vetor {

    private String[] nome;
    private int tamanho;


    public Vetor(int capacidade){
        this.nome = new String[capacidade];
        
    }



    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
