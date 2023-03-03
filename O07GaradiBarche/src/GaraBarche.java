public class GaraBarche {

	public static void main(String[] args) {
		Barca[] barche = {
				new Barca("Rosetta", "blu"),
				new Barca("Maurizio", "rosso"),
				new Barca("Rossana", "giallo"),
				new Barca("Roberto", "verde"),
				new Barca("Giulia", "nero"),
				
		};
		
		int passi=0;
		boolean inGara=true;
		
		do {
			passi++;
			System.out.println("***** Passo "+passi+" *****");
			
			// le barche avanzano
			for(Barca barca:barche) {
				barca.cambiaVelocita();
				barca.avanza();
				System.out.println(barca.toString().substring(0,6) + ": " + barca.grafica());
			}
			
			System.out.println();
			
			// qualcuna ha finito?
			for(Barca barca:barche) {
				if(barca.metri>=50)
					inGara=false;
			}
		}while(inGara);

	}

}



