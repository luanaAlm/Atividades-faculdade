
public enum Disciplina {
	MATEMATICA (60),
	F�SICA(40),
	QU�MICA(40),
	INGL�S(20);

	private int cargahoraria;

	private Disciplina (int ch) {
		this.cargahoraria = ch;
	}
	
	public int getCargahoraria() {
		return cargahoraria;
	}


}
