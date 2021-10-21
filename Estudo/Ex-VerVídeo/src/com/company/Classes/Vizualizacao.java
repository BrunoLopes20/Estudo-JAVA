package com.company.Classes;

public class Vizualizacao {
	//Atributos
	private Usuario espectador;
	private Video filme;
	//Construtor
	public Vizualizacao(Usuario espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
		this.filme.setReproduzindo(true);
	}
	//GET e SET
	public Usuario getEspectador() {
		return espectador;
	}
	public void setEspectador(Usuario espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}

	//ToString
	@Override
	public String toString() {
		return "Vizualizacao{" +
				"\n Espectador =" + espectador +
				", \n Video Clipe = " + filme +
				'}';
	}

	//Sobrecarga
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	public void avaliar(float porc) {
		int tot = 0;
		if(porc<=20){
			tot = 3;
		}else if(porc<=50){
			tot=5;
		}else if(porc<=90){
			tot=8;
		}else{
			tot=10;
		}
	}
}


