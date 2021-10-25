package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.EstoqueProduto;
import Model.Produto;

public class CadastrarProduto {
	
	
	public void cadastrarEstoque (Produto produto) {
		
		Connection con = null;
		ConexaoMYsql mysql = new ConexaoMYsql();
		con = mysql.ligarBanco();
		
		try {
			
			String produtoQuantidade = produto.getEstoque().getQuantidade();
			String produtoValidade = produto.getEstoque().getValidade();
			String produtoValorEstoque = produto.getEstoque().getValorTotal();
			String codigoProduto = produto.getEstoque().getId();
			
			
			
			String sql = "INSERT INTO estoque (id, quantidade, validade, valorTotal) VALUES (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, codigoProduto);
			ps.setString(2, produtoQuantidade);
			ps.setString(3, produtoValidade);
			ps.setString(4, produtoValorEstoque);
			ps.execute();			
		} catch (SQLException e) {System.out.println("Erro ao inserir na tabela estoque " + e); }
		
		
		
	}
	
	public void cadastrarProduto (Produto produto){
		
			Connection con = null; 
			ConexaoMYsql  mysql = new ConexaoMYsql();
			con = mysql.ligarBanco();
			
			try {
					
				String sql = "INSERT INTO produto ( nome, valor, marca, estoque_id) VALUES (?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(4, produto.getEstoque().getId());
				ps.setString(2, produto.getNome());
				ps.setString(3, produto.getValor());
				ps.setString(1, produto.getMarca());
				ps.execute();
		
			} catch (SQLException e) {System.out.println("Erro ao inserir na tabela produto" + e); }

	}
	
	public ResultSet buscarProduto (String codigo) {
		 
		ConexaoMYsql mysql = new ConexaoMYsql();
		Connection con = mysql.ligarBanco();;
		 
		 
	 
		Produto produto = new Produto();
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM produto WHERE nome='" + codigo + "'";
			 
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			  

		} catch (SQLException e) {System.out.println("Erro ao inserir na tabela buscarProduto" + e);}
		
		return rs;
	}
	
	public ResultSet buscarEstoque (String codigo) {
		
		ConexaoMYsql mysql = new ConexaoMYsql();
		
		Connection con = mysql.ligarBanco();;
		
		ResultSet rs = null;
		
		
		try {
			
			String sql = "select nome, marca, quantidade from produto INNER JOIN  estoque on produto.estoque_id =  estoque.id where estoque_id= '" +codigo+ "'";
			PreparedStatement ps  = con.prepareStatement(sql);
			 rs = ps.executeQuery();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rs; 
	}

}
