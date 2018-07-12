package br.com.unicred.correntista.model;

public class Cliente {

//	atributos
	private int codigo;
	private String nome;
	private String endereco;

//	 construtor
	public Cliente() {

	}

//	get e set
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
