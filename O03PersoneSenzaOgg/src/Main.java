//senza metodi
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome1;
		String cognome1;
		char sesso1;
		int eta1;
		boolean sposato1;
		
		nome1="Marco";
		cognome1="Rossi";
		sesso1='m';
		eta1=18;
		sposato1=false;
		
		System.out.println(statoCivile(sposato1, sesso1));
		
	}
	
	static String statoCivile(boolean sposato, char sesso) {
		if(sposato && sesso =='m')
			return "sposato";
		else if(sposato && sesso =='f')
			return "sposata";
		else if(!sposato && sesso =='m')
			return "celibe";
		else if(!sposato && sesso =='f')
			return "nubile";
		return null;
	}

}
