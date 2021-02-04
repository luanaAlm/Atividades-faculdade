package FactoryMethod;

public class TesteApp {
	
	public static void main(String args[]) {
		FactoryProfessor factory = new FactoryProfessor();
		factory.getProfessor("Fulano", 8);
		factory.getProfessor("Sicrano", 15);
	}
}