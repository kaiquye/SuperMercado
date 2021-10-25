package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.CadastrarProduto;
import Model.Produto;

public class arrayBuscar {
 
	
	public static ArrayList<Produto> listarProduto (String nome) throws SQLException
	{
		 CadastrarProduto  cas = new CadastrarProduto();
		 ResultSet rs =  cas.buscarProduto(nome);
		 Produto p = new Produto();
		 
		 
		 ArrayList<Produto> list = new ArrayList<Produto>();
		 	
			while (rs.next()) {
			
				p.setNome(rs.getString("nome"));
				p.setMarca(rs.getString("marca"));
				p.setValor(rs.getString("valor"));	
				list.add(p);		
				 
			}
			
			return list; 
	 
	}
	
	
	
}
