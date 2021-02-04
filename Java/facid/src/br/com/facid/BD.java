package br.com.facid;

import java.util.ArrayList;
import java.util.List;

public class BD {

	public static List<Pessoa> getPessoas() {
		List<Pessoa> retorno = new ArrayList<Pessoa>();

		Pessoa a = new Pessoa();
		a.setNome("Joao");
		a.setIdade(23);
		retorno.add(a);

		a = new Pessoa();
		a.setNome("Pedro");
		a.setIdade(20);
		retorno.add(a);

		a = new Pessoa();
		a.setNome("Luisa");
		a.setIdade(29);
		retorno.add(a);

		a = new Pessoa();
		a.setNome("Josefa");
		a.setIdade(99);
		retorno.add(a);

		return retorno;
	}

}