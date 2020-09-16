package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Connection conectar() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 		
            return DriverManager.getConnection("jdbc:mysql://localhost/javaweb?useTimezone=true&serverTimezone=UTC&user=root&password=malcolm77");			
		}catch(ClassNotFoundException e ) {
			throw new RuntimeException(e);
		}
	}

}