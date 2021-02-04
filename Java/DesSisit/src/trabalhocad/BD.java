package trabalhocad;

import java.util.ArrayList;
import java.util.List;

public class BD {

	private List<Maquinas> lista = new ArrayList<Maquinas>();
	Maquinas maquina;
	
	public List<Maquinas> getLista(){
		return lista;
	}
	
	public void setLista(String marca, String processador) {
		
		maquina = new Maquinas();
		maquina.setMarca(marca);
		maquina.setProcessador(processador);
		this.lista.add(maquina);
	}
}
