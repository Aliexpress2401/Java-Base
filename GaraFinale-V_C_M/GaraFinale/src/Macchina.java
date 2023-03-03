
public class Macchina {
	int velocita;
	int metri;
	int corsia;
	static int contaCorsia = 1;
	
	public Macchina() {
		super();
		corsia = contaCorsia++;
		metri = 0;
		velocita = 0;
	}
	
	public void cambiaMarcia() {
		//velocita = (int)(Math.random()*7);
		int caso = (int)(Math.random()*3)-1;
		velocita += caso;
		velocita = Math.min(velocita, 5);
		velocita = Math.max(velocita, 0);
	}
	
	void cambiaVelocita() {
		velocita = (int)(Math.random()*7);
	}

	void avanza() {
		for (int i=0; i<velocita; i++) {
			metri = metri + 1;
		}
	}

}