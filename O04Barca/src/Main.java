
 import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {

        Barca b1;
        int a=0;

        System.out.println("Nome barca: ");
        String nome = scan.nextLine();
        nome = nome.trim().toUpperCase();

        System.out.println("Colore barca: ");
        String colore = scan.nextLine();
        colore = colore.trim().toUpperCase();
        b1 = new Barca(nome, colore);


        do {

            System.out.println(b1 + "V: " + b1.getVelocita() + " M: " + b1.metri);
            b1.cambiaVelocita();
            a++;

        }while(b1.metri<50);

        a++;

        System.out.println("La barca ha impegato " + a + " passi per arrivare a destinazione");
    }


} 
