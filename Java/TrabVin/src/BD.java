import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BD {

	private List<Maquinas> lista = new ArrayList<Maquinas>();
	Maquinas maquina;
	
	public List<Maquinas> getLista(){
		return lista;
	}
	
	public void setLista(String nomeResp, String marca, String processador, int numSerie, Date entrega) {
		
		maquina = new Maquinas();
		maquina.setNomeResp(nomeResp);;
		maquina.setMarca(marca);
		maquina.setProcessador(processador);
		maquina.setNumSerie(numSerie);
		maquina.setEntrega(entrega);
		
	
		this.lista.add(maquina);
	}
}
