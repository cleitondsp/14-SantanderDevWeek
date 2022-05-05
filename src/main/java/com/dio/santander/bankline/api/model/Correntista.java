package com.dio.santander.bankline.api.model;

public class Correntista {
	
	// atributos do correntista
	
	private Integer id;
	private String cpf;
	private String nome;	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	// atributo da conta do correntista
	
	private Conta conta; // Indica q esse correntista possui uma "Conta" "conta" que possui numero e saldo
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	

}
