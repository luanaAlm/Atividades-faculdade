
public enum Disciplina {
	MATEMATICA (60),
	FÍSICA(40),
	QUÍMICA(40),
	INGLÊS(20);

	private int cargahoraria;

	private Disciplina (int ch) {
		this.cargahoraria = ch;
	}
	
	public int getCargahoraria() {
		return cargahoraria;
	}


}
