import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class Principal2 {

	public static void main(String[] args) {

		Hashtable<String, Automovel> automoveis = new Hashtable<String, Automovel>();

		Automovel a1 = new Automovel(Marca.FIAT, "Uno", "2011", "LCF-1234");
		Automovel a2 = new Automovel(Marca.VW, "Gol", "1998", "LCV-2639");
		Automovel a3 = new Automovel(Marca.FORD, "Ka", "1999", "GCF-6113");
		Automovel a4 = new Automovel(Marca.GM, "Onix", "2017", "LFX-6237");
		Automovel a5 = new Automovel(Marca.PEGEOUT, "208", "2009", "JCR-3234");

		automoveis.put(a1.getPlaca(),a1);
		automoveis.put(a2.getPlaca(),a2);
		automoveis.put(a3.getPlaca(),a3);
		automoveis.put(a4.getPlaca(),a4);
		automoveis.put(a5.getPlaca(),a5);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Digite a placa: ");  
			String placa=sc.next();  
			if (automoveis.containsKey(placa))
				System.out.println(automoveis.get(placa));
			else
				System.out.println("Carro não existe!!!");
		}

		//		Set<String> chaves = automoveis.keySet();
		//		for (String chave: chaves)
		//		    System.out.println(automoveis.get(chave));
		//		
	}

}
