package FactoryMethod;

class ProfessorHorista extends Professor {

	public ProfessorHorista(String nome) {
		this.nome = nome;
		System.out.println("Ol�, Prof. Horista  " 
				+ this.nome);
	}
}