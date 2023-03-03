public class Carta {
	private int valore;
	private boolean coperta;
	
	
	public Carta(int valore) {
		this.valore = valore;
		coperta = true;
	}

	
	public int getValore() {
		return valore;
	}

	public boolean isCoperta() {
		return coperta;
	}
	
	public void gira() {
		coperta = !coperta;
	}

	public String mostra() {
		return coperta ? "#" : ""+valore;
	}

	@Override
	public String toString() {
		
		return "" + valore +  (coperta ? "c" : "s");
	}
	
	public static void main(String[] args) {
		Carta c1 = new Carta(10);
		Carta c2 = new Carta(5);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.mostra());
		System.out.println(c2.mostra());
		
		
		c1.gira();
		
		
		System.out.println(c1.mostra());
		System.out.println(c2.mostra());
		

	}

}