import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		int scelta=0;
		do {

			System.out.println("\n1.Triangolo\n2.Rettangolo\n3.Cerchio\n0.Esci");
			scelta = scan.nextInt();

			if(scelta==1) {
				triangolo();
			}

			if(scelta==2) {
				rettangolo();
			}

			if(scelta==3) {
				cerchio();
			}

		}while(scelta!=0);

	}




	public static void triangolo() {

		System.out.println("Inserire base del triangolo: ");
		int base = scan.nextInt();

		System.out.println("Inserire altezza del triangolo: ");
		int altezza = scan.nextInt();

		Triangolo t1 = new Triangolo(base, altezza);
		t1.area();
		System.out.println("L'area del triangolo è: " + t1.area);

	}

	public static void rettangolo() {

		System.out.println("Inserire base del rettangolo: ");
		int base = scan.nextInt();

		System.out.println("Inserire area del rettangolo: ");
		int altezza = scan.nextInt();

		Rettangolo r1 = new Rettangolo(base, altezza);

		r1.area();
		System.out.println("L'area del rettangolo è: " + r1.area);


	}

	public static void cerchio() {

		System.out.println("Inserire raggio cerchio: ");
		int raggio = scan.nextInt();

		Cerchio c1 = new Cerchio(raggio);

		c1.area();
		System.out.println("L'area del rettangolo è: " + c1.area);


	}


}