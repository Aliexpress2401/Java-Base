public class CartaGioco extends Carta {
	private char seme;

	public CartaGioco(int valore, char seme) {
		super(valore);
		this.seme = seme;
	}
	
	public char getSeme() {
		return seme;
	}
	
	@Override
	public String mostra() {
		return isCoperta() ? "#" : ""+ getValore()+seme;
	}
	
	@Override
	public String toString() {
		return "" + getValore() + seme +  (isCoperta() ? " c" : " s");
	}

	public static void main(String[] args) {
		CartaGioco cg = new CartaGioco(1, 'C');
		System.out.println(cg);
		System.out.println(cg.mostra());
		cg.gira();
		System.out.println(cg.mostra());
	}
}