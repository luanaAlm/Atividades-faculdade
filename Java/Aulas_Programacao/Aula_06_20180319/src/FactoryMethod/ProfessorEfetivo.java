package FactoryMethod;

class ProfessorEfetivo extends Professor {

	public ProfessorEfetivo(String nome) {
		this.nome = nome;
		System.out.println("Ol�, Prof. Efetivo  " 
				+ this.nome);
	}
}