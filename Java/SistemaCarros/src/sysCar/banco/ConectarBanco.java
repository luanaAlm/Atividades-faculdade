package sysCar.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ConectarBanco {
	private static final String USUARIOBANCO = "root";
	private static final String SENHABANCO = "Hacker101";
	private static final String CAMINHO = "jdbc:mysql://127.0.0.1:3306/sysCar";

	public static Connection metodoConectarBanco() throws SQLException {
		DriverManager.registerDriver(new Driver());
		Connection conexaoComBanco = DriverManager.getConnection(CAMINHO, USUARIOBANCO, SENHABANCO);
		return conexaoComBanco;
	}
}