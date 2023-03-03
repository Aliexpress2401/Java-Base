
public class Main{
	public static void main(String[] args) {
		
		Campanello[] campanelli = {
				new Campanello("Pippo",10,"dindon",5),
				new Campanello("Pluto",5,"dannn",2),
				new Campanello("Pina",4,"dindin",1),
				new Campanello("Pio",3,4),
				new Campanello("Paolo",6,6)
		};
		
		for(int i=0; i<campanelli.length; i++) {
			System.out.println(campanelli[i]);
			System.out.println(campanelli[i].suona());
		}
		
	}
}