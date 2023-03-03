
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobile auto1 = new Automobile("rossa", "Ferrari", 350);
		Automobile auto2 = new Automobile("blu", "Mini", 50);
		
		System.out.println(auto1.velocita);
		System.out.println(auto2.velocita);
		
		auto2.accelera();
		System.out.println(auto2.velocita);
	}

}
