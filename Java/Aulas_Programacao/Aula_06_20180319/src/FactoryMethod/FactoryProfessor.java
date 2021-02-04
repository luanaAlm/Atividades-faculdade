package FactoryMethod;

class FactoryProfessor {

	public Professor getProfessor(String nome, int ch) {
		if (ch > 10)
			return new ProfessorEfetivo(nome);
		else
			return new ProfessorHorista(nome);
	}

}