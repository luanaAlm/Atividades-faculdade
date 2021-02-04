import java.util.Random;

public class Dado {
	public static Dado instancia;
	private Random randomico;
	
	private Dado() {
		this.randomico = new Random();
	}

	public static Dado getDado() {
		if (instancia == null)
			instancia = new Dado();
		return instancia;
	}
	
	public int getNumero() {
		return (1 + randomico.nextInt(6)) ;
	}
	


}
