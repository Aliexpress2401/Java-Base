public class MainCani {

	public static void main(String[] args) {
		
		Cane[] cani = {
				new CaneSelvatico(30, "Golden Retriver", "cioccolato", 125),
				new CaneDomestico(40, "Golden Retriver", "panna", "Lautaro"),
				new CaneSelvatico(10, "Golden Retriver", "marmellata", 126),
				new CaneDomestico(40, "Golden Retriver", "panna", "Degio"),
		};
		
		for (Cane cane : cani) {
			cane.corri();
			
			
			if(cane instanceof CaneDomestico) {
				//CaneDomestico cd = (CaneDomestico) cane;
				//cd.setVaccinato(true);
				
				((CaneDomestico)cane).setVaccinato(true);
			}
			
			System.out.println(cane);
		}
		
		
//		cs.corri();
//		System.out.println(cs);
//		
//		
//		cd.setVaccinato(true);
//		System.out.println(cd);
	}

}