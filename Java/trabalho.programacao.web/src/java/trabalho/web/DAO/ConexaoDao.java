
package trabalho.web.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalho.web.atributus.Filiados;
import trabalho.web.conexao.GeraConexao;

public class ConexaoDao {
    public void salva(Filiados filiado){
        try {
            Connection conexao = GeraConexao.getConexao();
            PreparedStatement ps;
           if(filiado.getId() == null){
                ps = conexao.prepareStatement("INSERT INTO `cadastro`(`nome`,`sobrenome`,`idade`,`data`,`contribuicao`,`observacao`)VALUES(?,?,?,?,?,?);");
            } else {
                ps = conexao.prepareStatement("update cadastro set nome=?, sobrenome=?, idade=?,data=?, contribuicao=?, observacao=?,where id=?");
                ps.setInt(5, filiado.getId());
            }
            
            ps.setString(1, filiado.getNome());
            ps.setString(2, filiado.getSobrenome());
            ps.setInt(3, filiado.getIdade());
            ps.setString(4, filiado.getData());
            //ps.setDate(4, new Date(filiado.getData().getTime()));
            ps.setDouble(5, filiado.getContribuicao());
            ps.setString(6, filiado.getObservacao());
            ps.execute();
           // GeraConexao.fecharConexao();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Filiados> buscar(){
        try {
            Connection conexao = GeraConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select *from cadastro");
            
            ResultSet resultSet = ps.executeQuery();
            List<Filiados> filiados = new ArrayList<>();
            while(resultSet.next()){
                Filiados filiado = new Filiados();
                filiado.setId(resultSet.getInt("id"));
                filiado.setNome(resultSet.getString("nome"));
                filiado.setSobrenome(resultSet.getString("sobrenome"));
                filiado.setIdade(resultSet.getInt("idade"));
                filiado.setData(resultSet.getNString("data"));
                filiado.setContribuicao(resultSet.getDouble("contribuição"));
                filiado.setObservacao(resultSet.getString("observação"));
                filiados.add(filiado);
            }
            return filiados;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}
