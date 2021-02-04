
package Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;

public class FabricaConexaoPessoa {
  
	// privados, não precisam ser instanciados e são constantes.
	private static final String USUARIO = "root";
	private static final String SENHA = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/trabalhoweb";

	public static Connection conexao() throws SQLException { // propaguei a exceção para quem chamar a conexão
		// registro do Driver não obrigatório a partir do java 6
		DriverManager.registerDriver(new Driver());
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}

	/*
	 * // teste public static void main(String[] args) { try { Connection
	 * testeDeConexao = ConexaoFactory.conectar();
	 * System.out.println("Conexão realizada com sucesso!"); } catch (SQLException
	 * e) { e.printStackTrace();
	 * System.out.println("Não foi possível realizar a conexão!"); } }
	 */

    static PreparedStatement conexao(String insert_into_tabelapessoanomedataNascender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
