package com.company;

import java.util.Objects;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    public void marcarLuta(Lutador l1, Lutador l2) {
        if(Objects.equals(l1.getCategoria(),l2.getCategoria()) && (l1 != l2)){
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        }else{
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }


    public void lutar() {
        if(aprovada){
            desafiado.apresentar();
            System.out.println("VAI LUTAR COM ");
            desafiante.apresentar();
            double v = (int) (0 + Math.random() *(2-0));
            int vencedor = (int)v;
            switch (vencedor){
                case 0:
                    System.out.println("EMPATE");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    System.out.println("***********");
                    break;
                case 1:
                    System.out.println("DESAFIADO " + desafiado.getNome() + " GANHOU A LUTA");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    System.out.println("***********");
                    break;
                case 2:
                    System.out.println("DESAFIANTE " + desafiante.getNome() + " GANHOU A LUTA");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    System.out.println("***********");
                    break;
            }
        }else{
            System.out.println("A luta não vai acontecer !");
        }

    }
}
