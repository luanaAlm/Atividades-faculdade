
package trabalho.web.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GeraConexao {
    private static Connection conexao;
    private static final String URL_CONEXAO ="jdbc:mysql://127.0.0.1:3306/bancotrabalho";
    private static final String USER = "root";
    private static final String SENHA = "bancoteste";
    
    public static Connection getConexao() {
        
        if(conexao == null){
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try {
                    conexao = DriverManager.getConnection(URL_CONEXAO,USER,SENHA);
                } catch (SQLException ex) {
                    Logger.getLogger(GeraConexao.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GeraConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        return conexao;
    }
        public static void fecharConexao(){
            if(conexao != null){
                try {
                    conexao.close();
                    conexao = null;
                } catch (SQLException ex) {
                    Logger.getLogger(GeraConexao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    
}
