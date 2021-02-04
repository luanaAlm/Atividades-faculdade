
public class Automovel {
	
	private Marca marca;
	private String modelo;
	private String ano;
	private String placa;
		
	public Automovel(Marca marca, String modelo, String ano, String placa) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getAno() {
		return ano;
	}
	public String getPlaca() {
		return placa;
	}

	@Override
	public String toString() {
		return "Automovel [marca=" + marca.getNome() + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + "]";
	}
}
