public class Barca {
	String nome;
	String colore;
	int velocita;
	int metri;
	
	
	public Barca(String nome, String colore) {
		this.nome = nome;
		this.colore = colore;
		velocita = 0;
		metri = 0;
	}

	void cambiaVelocita() {
		velocita = (int)(Math.random()*7);
	}
	void avanza() {
		metri += velocita;
	}

	@Override
	public String toString() {
		return nome.toUpperCase() + " (" + colore.toUpperCase() + ")";
	}
	
	String grafica() {
		String linea="";
		for(int i=0; i<metri;i++)
			linea+="=";
		return linea;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barca barca = new Barca("Margherita", "Bianco");
		
		System.out.println(barca);
	}

}