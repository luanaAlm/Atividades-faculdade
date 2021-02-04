package Pessoa;
//gera a conexao e feha a conexao
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class GeraConexaoBD {
 private static Connection conexao;
    private static final String URL_CONEXAO ="jdbc:mysql://localhost:3306/trabalhoweb";
    private static final String USER = "root";
    private static final String SENHA = "root";
    
    public static Connection getConexao() {
        
        if(conexao == null){
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try {
                    conexao = DriverManager.getConnection(URL_CONEXAO,USER,SENHA);
                } catch (SQLException ex) {
                    Logger.getLogger(GeraConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GeraConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(GeraConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    static Connection conexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
