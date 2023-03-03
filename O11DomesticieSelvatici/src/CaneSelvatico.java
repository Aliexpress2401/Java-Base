public class CaneSelvatico extends Cane{
	private int idRegistrazione;

	public CaneSelvatico(int peso, String razza, String colore, int idRegistrazione) {
		super(peso, razza, colore);
		this.idRegistrazione = idRegistrazione;
	}
	
	public int getIdRegistrazione() {
		return idRegistrazione;
	}
	
	@Override
	public String toString() {
		return "idRegistrazione=" + idRegistrazione + " " + super.toString();
	}

	
	
	
}