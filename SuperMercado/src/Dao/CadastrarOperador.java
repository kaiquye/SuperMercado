package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Operador;

public class CadastrarOperador {
	
	
	public void CadastrarOperador (Operador operador) 
	{
		 
		Connection con = null; 
		ConexaoMYsql mysql = new ConexaoMYsql();
		con = mysql.ligarBanco();
		try {
			String sql = "INSERT INTO operador (nome,caixa) VALUES (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, operador.getNome());
			ps.setString(2, operador.getCaixa());
			ps.execute();

		}  
		catch (SQLException erro) {
			System.out.println("ERRO CLASSE CADSATROOPERADOR / CadastrarOperador > " + erro);
			// TODO: handle exception
		}
	
	}
	
	
	

}
