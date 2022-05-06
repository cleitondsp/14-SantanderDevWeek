package com.dio.santander.bankline.api.model;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_correntista") // criando uma tabela com o atributos abaixo

public class Correntista {
	
	// atributos do correntista
		@Id														// essa sera chave primaria
		@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private Integer id;
	
		@Column(length = 20)		// primeira coluna da tabela
	private String cpf;
		
		@Column(length = 60)		// segunda coluna da tabela
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
	
		@Embedded		// significa que existe uma conexão com outra classe - "Conta"
	private Conta conta; // Indica q esse correntista possui uma "Conta" "conta" que possui numero e saldo
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	

}
