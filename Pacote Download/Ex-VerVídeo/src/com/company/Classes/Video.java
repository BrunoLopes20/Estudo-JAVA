package com.company.Classes;

import com.company.Interface.AcoesVideo;

public class Video implements AcoesVideo {
	//Atributos
	private String titulo;
	private int avaliacao;
	private long views;
	private long curtidas;
	private boolean reproduzindo;

	//Construtor
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	//GET e SET

	public String getTitulo() {
		return titulo;
	}
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	protected void setAvaliacao(int avaliacao) {
		int nova;
		nova = ((int) ((this.avaliacao + avaliacao)/this.views));
		this.avaliacao = avaliacao;
	}
	public long getViews() {
		return views;
	}
	protected void setViews(long views) {
		this.views = views;
	}
	public long getCurtidas() {
		return curtidas;
	}
	protected void setCurtidas(long curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	protected void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
		this.views++;
	}


	//Métodos Públicos
	@Override
	public void play() {
		this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
	}

	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas() + 1);
	}

	@Override
	public String toString() {
		return "Video{" +
				"titulo = '" + titulo + '\'' +
				", avaliacao = " + avaliacao +
				", views = " + views +
				", curtidas = " + curtidas +
				", reproduzindo = " + reproduzindo +
				'}';
	}
}
