package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dao.CadastrarProduto;
import Model.EstoqueProduto;
import Model.Produto;
import View.Estoque;

public class BuscarEstoque  {

	public ArrayList<Produto> buscarEstoque (String codigoDeBarras) throws SQLException {

		 CadastrarProduto  cas = new CadastrarProduto();
		 ResultSet rs =  cas.buscarEstoque(codigoDeBarras);
		 Produto p = new Produto();
		 ArrayList<Produto> list = new ArrayList<>();
		 EstoqueProduto estoque = new EstoqueProduto();
		 
		 while(rs.next()) {
			
			 
			 p.setNome(rs.getString("nome"));
			 p.setMarca(rs.getString("marca"));
			 estoque.setQuantidade(rs.getString("quantidade"));
			 p.setEstoque(estoque);
			 
			 list.add(p);
			 
		 }
		 
		 return list;
	}
 


}
