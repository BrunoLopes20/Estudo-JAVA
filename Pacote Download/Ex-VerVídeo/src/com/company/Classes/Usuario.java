package com.company.Classes;

import com.company.Classes.Pessoa;

public class Usuario extends Pessoa {
	//Atributos
	private String login;
	private int totalAssistido;

	//Construtor
	public Usuario(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totalAssistido = 0;
	}

	//GET e SET

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotalAssistido() {
		return totalAssistido;
	}
	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}

	//Métodos
	public void assisMaisUm(){
		this.totalAssistido++;
	}

	@Override
	public String toString() {
		return " Usuario{" +
				" nome= '" + nome + '\'' +
				", idade = " + idade +
				", sexo = '" + sexo + '\'' +
				", login = '" + login + '\'' +
				", totalAssistido = " + totalAssistido +
				'}';
	}

}
