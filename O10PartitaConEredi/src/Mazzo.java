public class Mazzo {
	private CartaGioco[] carte;
	private int posizione;

	public Mazzo() {
		String semi="CQPF";
		
		carte = new CartaGioco[52];
		
		for(int i = 0; i < carte.length; i++)
			carte[i] = new CartaGioco(i % 13 + 1, semi.charAt(i/13));
		
		posizione=0;
	}
	
	public void mescola() {
		int a,b;
		for (int i = 0; i < carte.length; i++) {
			a=(int)(Math.random()*carte.length);
			b=(int)(Math.random()*carte.length);
			
			CartaGioco temp = carte[a];
			carte[a] = carte[b];
			carte[b] = temp;
		}
	}

	public CartaGioco pesca() {
		if(posizione >= carte.length)
			return null;
		else
			return carte[posizione++];
	}
	
	@Override
	public String toString() {
		String temp ="";
		for(int i = 0; i < carte.length; i++)
			temp = temp + carte[i]+" ";
		
		return temp;
	}
	
	
	
	
}