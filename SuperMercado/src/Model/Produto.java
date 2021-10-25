package Model;

import java.util.ArrayList;

public class Produto {
	
	private String id;
	private String nome;
	private String valor;
	private String marca;
	private EstoqueProduto estoque; 
	 
	
	
	
	
	
	public Produto() {


	}
	public Produto(String nome, String valor, String marca, EstoqueProduto estoque) {


		this.nome = nome;
		this.valor = valor;
		this.marca = marca;
		this.estoque = estoque;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public EstoqueProduto getEstoque() {
		return estoque;
	}
	public void setEstoque(EstoqueProduto estoque) {
		this.estoque = estoque;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}



