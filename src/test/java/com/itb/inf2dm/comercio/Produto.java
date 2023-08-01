package com.itb.inf2dm.comercio;

public class Produto {
	private Long id;
	private String descricao;
	private String codigoBarras;
	private String nome;
	private double preco;
	
	public void setId(Long id) {
		this.id = id;
		
	}
	
	public long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	public void setCodigodeBArras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public double getPreco() {
	 return preco;
	}
	public void setPreco(double preco) {
		this.preco= preco;
	}
	

}
