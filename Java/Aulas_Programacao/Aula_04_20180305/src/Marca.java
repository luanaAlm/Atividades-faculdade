
public enum Marca {
	VW("Volkswagen"),
	FORD("Ford"),
	GM("Chevrolet"),
	CITROEN("Citroen"),
	PEGEOUT("Pegeout"),
	FIAT("Fiat"), 
	KIA("Kia"), 
	BMW("BMW");
	
	private final String Nome;
	
	private Marca(String nome) {
		Nome = nome;
	}

	public String getNome() {
		return Nome;
	}
	
}
