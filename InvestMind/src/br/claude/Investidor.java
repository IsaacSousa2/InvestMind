package br.claude;

public class Investidor {

	private String nome;
	private String cpf;
	
	public Investidor() {
		
	}
	
	public Investidor(String nome, String cpf) {
		
		this.nome = nome;
		this.cpf = cpf;
		
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
