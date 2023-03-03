public class Cane {
	private int peso;
	private String razza;
	private String colore;
	private boolean fermo;
	
	public Cane(int peso, String razza, String colore) {
		this.peso = peso;
		this.razza = razza;
		this.colore = colore;
		fermo = true;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getRazza() {
		return razza;
	}

	public String getColore() {
		return colore;
	}

	public boolean isFermo() {
		return fermo;
	}
	
	public void corri() {
		fermo = false;
	}
	public void fermati() {
		fermo = true;
	}

	@Override
	public String toString() {
		return "peso=" + peso + ", razza=" + razza + ", colore=" + colore + ", fermo=" + fermo;
	}
	
	public static void main(String[] args) {
		Cane c = new Cane(6, "Bastardino", "Bianco");
		c.corri();
		System.out.println(c);
		if(c.getPeso()>10)
			System.out.println("Cane ciccione!");
		else
			System.out.println("Cane in forma");
		
	}
	
}






