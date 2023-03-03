public class CaneDomestico extends Cane {
	

	private String nome;
	private boolean vaccinato;
	
	public CaneDomestico(int peso, String razza, String colore, String nome) {
		super(peso, razza, colore);
		this.nome = nome;
		vaccinato = false;
	}

	public boolean isVaccinato() {
		return vaccinato;
	}

	public void setVaccinato(boolean vaccinato) {
		this.vaccinato = vaccinato;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", vaccinato=" + vaccinato + " "+super.toString();
	}
	
	
	
}