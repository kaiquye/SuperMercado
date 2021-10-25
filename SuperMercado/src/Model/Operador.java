package Model;

public class Operador {
	
	private String id;
	private String nome;
	private String caixa;
	
	
	
	
	
 
	public Operador() {
		 
	}
	public Operador(String nome, String caixa) {
		 
		this.nome = nome;
		this.caixa = caixa;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCaixa() {
		return caixa;
	}
	public void setCaixa(String caixa) {
		this.caixa = caixa;
	} 
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	

}
