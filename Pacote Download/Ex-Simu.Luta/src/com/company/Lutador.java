package com.company;

public class Lutador implements InterLutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Construtor
    public Lutador(String no, String na, int id, float al,
                   float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    //GET e SET
    protected String getNome() {
        return nome;
    }

    private void setNome(String no) {
        this.nome = no;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int id) {
        this.idade = id;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float al) {
        this.altura = al;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vi) {
        this.vitorias = vi;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int de) {
        this.derrotas = de;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int em) {
        this.empates = em;
    }

/*----------------------------------------------------------------------------*/


    @Override
    public void apresentar() {
        System.out.println("********************");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("********************");

    }

    @Override
    public void status() {
        System.out.println("********************");
        System.out.println(this.getNome());
        System.out.println("é um peso: " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("********************");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
