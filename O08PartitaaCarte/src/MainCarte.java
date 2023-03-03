public class MainCarte {

	public static void main(String[] args) {
		Mazzo m1 = new Mazzo();
		
		System.out.println(m1);
		
		m1.mescola();
		
		System.out.println(m1);
		
		for (int i = 0; i < 53; i++) {
			Carta pescata = m1.pesca();
			if(pescata!=null)
				System.out.println(pescata);
			else
				System.out.println("Mi spiace le carte son finite!");
		}

	}

}