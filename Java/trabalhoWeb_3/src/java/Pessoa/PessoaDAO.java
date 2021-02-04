package Pessoa;

//objeto de acesso ao banco de dados

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaDAO {

    public void salva(PessoaDTO pessoa) {
   
         try {
            Connection conexao = GeraConexaoBD.getConexao();
            PreparedStatement ps;
                ps = conexao.prepareStatement("INSERT INTO `tabelapessoas` (`nome`,`endereco`,`numCasa`,`telefone`,`contVol`,`observacao`) VALUES(?,?,?,?,?,?);");
            ps.setString(1, pessoa.getNome());
       ps.setString(2, pessoa.getEndereco());
       ps.setInt(3, pessoa.getNumCasa());
       ps.setString(4, pessoa.getTelefone());
       ps.setDouble(5, pessoa.getContVol());
       ps.setString(6, pessoa.getObservacao());
       ps.execute();
       GeraConexaoBD.fecharConexao();

         
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<PessoaDTO> buscar(){
        try {
            Connection conexao = GeraConexaoBD.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select *from tabelapessoas");
            
            ResultSet resultSet = ps.executeQuery();
            List<PessoaDTO> listaDePessoas = new ArrayList<>();
            while(resultSet.next()){
                PessoaDTO pessoa1 = new PessoaDTO();
                pessoa1.setNome(resultSet.getString("nome"));
                pessoa1.setEndereco(resultSet.getString("endereco"));
                pessoa1.setNumCasa(resultSet.getInt("numCasa"));
                pessoa1.setTelefone(resultSet.getString("telefone"));
                pessoa1.setContVol(resultSet.getDouble("contVol"));
                pessoa1.setObservacao(resultSet.getString("observacao"));
                
               listaDePessoas.add(pessoa1);

            }
            return listaDePessoas;
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
