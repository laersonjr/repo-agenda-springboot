package com.laerson;

public class Contato {
	
	
	private String nome;
	
	private String telefone;
	
	private String id;
	
	public Contato() {
		
	}

	public Contato(String id, String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.id = id;
	}
	
	//Boolean aceita true, false e null, diferente de boolean onde aceita apenas true e false
	
	public boolean isNovo() {
		return id == null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
