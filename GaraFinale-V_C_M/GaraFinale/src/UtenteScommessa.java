public class UtenteScommessa {

	String nome;
	int importo;
	int scelta;	
	int soldiFinali;

	public UtenteScommessa(String name, int scommessa, int macchina) {
		nome=name;
		importo=scommessa;
		scelta=macchina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getImporto() {
		return importo;
	}

	public void setImporto(int importo) {
		this.importo = importo;
	}

	public int getScelta() {
		return scelta;
	}

	public void setScelta(int scelta) {
		this.scelta = scelta;
	}

	public int soldiVinti() {
		soldiFinali = importo*5;
		return soldiFinali;		
	}

	@Override
	public String toString() {
		return nome.toUpperCase() + " (" + scelta + " " + importo+ ")";
	}

}