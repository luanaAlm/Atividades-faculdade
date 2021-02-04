import java.util.Date;

public class Maquinas {
	private String marca, processador;
	private String nomeResp;
	private Date entrega;
	private int numSerie;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public String getNomeResp() {
		return nomeResp;
	}
	public void setNomeResp(String nomeResp) {
		this.nomeResp = nomeResp;
	}
	public Date getEntrega() {
		return entrega;
	}
	public void setEntrega(Date entrega) {
		this.entrega = entrega;
	}
	public int getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	
	
}
