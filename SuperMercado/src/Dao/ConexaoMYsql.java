package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//conex�o com o banco de dados mysql
public class ConexaoMYsql {
	
	
	public Connection ligarBanco() {
		 
			Connection  con = null; 
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/estoquesupermercado?useTimezone=true&serverTimezone=UTC","root","1234");		
			System.out.println("Conex�o com o banco feita ! ");
			
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao conectar ao banco > "+ e);
			// TODO: handle exception
		}
		return con;
			
		
	}

}
