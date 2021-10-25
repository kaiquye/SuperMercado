package Model;

public class EstoqueProduto {
	
	private String id;
	private String quantidade;
	private String validade; 
	private String valorTotal;
	
	
	
	
	
	
	
	public EstoqueProduto(String quantidade, String validade, String valorTotal) {
    	this.quantidade = quantidade;
		this.validade = validade;
		this.valorTotal = valorTotal;
	}
	public EstoqueProduto() {
		 
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	

}
