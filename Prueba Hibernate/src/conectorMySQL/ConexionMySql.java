package conectorMySQL;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexionMySql {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/nba?useSSL=false";
		String usuario = "root";
		String pass = "alumno";

		try {
			Connection MiConexion = DriverManager.getConnection(url, usuario, pass);

			System.out.println("Conectado con éxito");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
