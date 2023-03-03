
public class Automobile {
		// proprietà
		String colore;
		String marca;
		int velocita;
		
		//costruttore
		Automobile(String c, String m, int v){
			colore = c;
			marca = m;
			velocita = v;
			
		}
		
		//metodi
		void accelera() {
			velocita +=5;
		}
}
