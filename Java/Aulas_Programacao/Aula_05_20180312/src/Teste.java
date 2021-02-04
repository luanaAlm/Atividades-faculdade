
public class Teste {
	private static int atrib_st = 0;
	private int atrib;
	
	public Teste(int atrib) {
		super();
		this.atrib = atrib;
		atrib_st++;
	}

	@Override
	public String toString() {
		return "Teste [atrib=" + atrib + " atrib_st=" +  + atrib_st +"]";
	}


	

}
