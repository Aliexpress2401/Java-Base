public class Campanello {
	String nome;
	int peso;
	String suono;
	int ripetizioni;
	
	public Campanello(String nome, int peso, String suono, int ripetizioni) {
		this.nome = nome;
		this.peso = peso;
		this.suono = suono;
		this.ripetizioni = ripetizioni;
	}
	public Campanello(String nome, int peso, int ripetizioni) {
		String[] suoniCasuali = {"din", "don", "dan", "plink","plank", "plunk"};
		
		this.nome = nome;
		this.peso = peso;
		
		int caso = (int)(Math.random()*suoniCasuali.length);
		this.suono = suoniCasuali[caso];
		
		this.ripetizioni = ripetizioni;
	}
	
	String suona() {
		String temp="";
		for(int i =0; i<ripetizioni; i++)
			temp+=suono+" ";
		return temp;
	}
	
	@Override
	public String toString() {
		return nome + " ("+peso+")";
	}
	
	
	
	
}