
public enum Mes {
	JAN("Janeiro", 31),
	FEV("Fevereiro",28),
	MAR("Março",31),
	ABR("Abril",30),
	MAI("Maio",31),
	JUN("Junho",30),
	JUL("Julho",31),
	AGO("Agosto",31);
	
	private final String Nome;
	private final int Quantidade;
	
	private Mes(String nome, int quantidade) {
		Nome = nome;
		Quantidade = quantidade;
	}

	public String getNome() {
		return Nome;
	}

	public int getQuantidade() {
		return Quantidade;
	}

}
