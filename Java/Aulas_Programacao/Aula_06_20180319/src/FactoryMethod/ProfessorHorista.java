package FactoryMethod;

class ProfessorHorista extends Professor {

	public ProfessorHorista(String nome) {
		this.nome = nome;
		System.out.println("Olá, Prof. Horista  " 
				+ this.nome);
	}
}