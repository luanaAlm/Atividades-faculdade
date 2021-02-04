package sysCar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sysCar.banco.ConectarBanco;
import sysCar.dto.CarroDTO;

public class CarroDAO {

	public void salvar(CarroDTO carro) throws SQLException {
		String comandoSQL = "INSERT INTO carro (modelo,preco,observacoes,datavenda) VALUES (?,?,?,?)";
		Connection conectandoBanco = ConectarBanco.metodoConectarBanco();
		PreparedStatement scriptParaOBanco = conectandoBanco.prepareStatement(comandoSQL);
		scriptParaOBanco.setString(1, carro.getModelo());
		scriptParaOBanco.setDouble(2, carro.getPreco());
		scriptParaOBanco.setString(3, carro.getObservacoes());
		scriptParaOBanco.setDate(4, new java.sql.Date(carro.getDatavenda().getTime()));
		scriptParaOBanco.executeUpdate();
	}

	public ArrayList<CarroDTO> listar() throws SQLException {
		String comandoSQL = "SELECT id,modelo,preco,observacoes,datavenda FROM carro";
		Connection conectandoBanco = ConectarBanco.metodoConectarBanco();
		PreparedStatement scriptParaOBanco = conectandoBanco.prepareStatement(comandoSQL);
		ResultSet listagem_de_carros = scriptParaOBanco.executeQuery();
		ArrayList<CarroDTO> lista_de_carros = new ArrayList<CarroDTO>();
		while (listagem_de_carros.next()) {
			CarroDTO carro = new CarroDTO();
			carro.setId(listagem_de_carros.getInt("id"));
			carro.setModelo(listagem_de_carros.getString("modelo"));
			carro.setPreco(listagem_de_carros.getDouble("preco"));
			carro.setObservacoes(listagem_de_carros.getString("observacoes"));
			carro.setDatavenda(listagem_de_carros.getDate("datavenda"));
			lista_de_carros.add(carro);
		}
		return lista_de_carros;
	}

	public void editar(CarroDTO carro) throws SQLException {
		String comandoSQL = "UPDATE carro SET modelo=?,preco=?,observacoes=?,datavenda=? WHERE id=?";
		Connection conectandoBanco = ConectarBanco.metodoConectarBanco();
		PreparedStatement scriptParaOBanco = conectandoBanco.prepareStatement(comandoSQL);
		scriptParaOBanco.setString(1, carro.getModelo());
		scriptParaOBanco.setDouble(2, carro.getPreco());
		scriptParaOBanco.setString(3, carro.getObservacoes());
		scriptParaOBanco.setDate(4, new java.sql.Date(carro.getDatavenda().getTime()));
		scriptParaOBanco.executeUpdate();
	}

	public void deletar(CarroDTO carro) throws SQLException {
		String comandoSQL = "DELETE FROM carro WHERE id=?";
		Connection conectandoBanco = ConectarBanco.metodoConectarBanco();
		PreparedStatement scriptParaOBanco = conectandoBanco.prepareStatement(comandoSQL);
		scriptParaOBanco.setInt(1, carro.getId());
		scriptParaOBanco.executeUpdate();
	}
}
