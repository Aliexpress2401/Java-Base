public class Mazzo {
	private Carta[] carte;
	private int posizione;

	public Mazzo() {
		carte = new Carta[52];
		
		for(int i = 0; i < carte.length; i++)
			carte[i] = new Carta(i % 13 + 1);
		
		posizione=0;
	}
	
	public void mescola() {
		int a,b;
		for (int i = 0; i < carte.length; i++) {
			a=(int)(Math.random()*carte.length);
			b=(int)(Math.random()*carte.length);
			
			Carta temp = carte[a];
			carte[a] = carte[b];
			carte[b] = temp;
		}
	}

	public Carta pesca() {
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