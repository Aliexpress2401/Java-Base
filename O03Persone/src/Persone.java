
public class Persone {
		// attributi
	
	String nome;
	String cognome;
	char sesso;
	int eta;
	boolean sposato;
	
	
		//costruttore
	public Persone(String nome, String cognome, char sesso, int eta, boolean sposato) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.eta = eta;
		this.sposato = sposato;
	}
	
		//metodi
	String statoCivile() {
		if(sposato==true && sesso =='m')
			return "sposato";
		else if(sposato && sesso =='f')
			return "sposata";
		else if(!sposato && sesso =='m')
			return "celibe";
		else
			return "nubile";

	}
	
	String nomeCompleto() {
		return nome + " " + cognome;
	}
	
	boolean isMinore() {
		//alternative
		// return eta<18 ? true : false;
		return eta<18;
	}
	
	public String toString() {
		return nomeCompleto() + ", " + statoCivile() + ", " +
				(isMinore()?"minorenne" : "maggiorenne");
	}
	
	
	
	
	
	
}
