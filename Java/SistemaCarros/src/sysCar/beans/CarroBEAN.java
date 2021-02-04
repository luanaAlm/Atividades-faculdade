package sysCar.beans;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import sysCar.dao.CarroDAO;
import sysCar.dto.CarroDTO;

@ManagedBean
public class CarroBEAN {

	private CarroDTO carro;
	private ArrayList<CarroDTO> carros;

	public void salvar() {
		carro = new CarroDTO();
		try {
			CarroDAO dao = new CarroDAO();
			dao.salvar(carro);
			System.out.println("Carro Salvo!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@PostConstruct
	public void listar() {
		try {
			CarroDAO dao = new CarroDAO();
			carros = dao.listar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void editar() {
		try {
			CarroDAO dao = new CarroDAO();
			dao.editar(carro);
			System.out.println("Carro Editado!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deletar() {
		try {
			CarroDAO dao = new CarroDAO();
			dao.deletar(carro);
			System.out.println("Carro Excluído!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public CarroDTO getCarro() {
		return carro;
	}

	public void setCarro(CarroDTO carro) {
		this.carro = carro;
	}

	public ArrayList<CarroDTO> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<CarroDTO> carros) {
		this.carros = carros;
	}

}
