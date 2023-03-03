import java.util.Random;

public class Barca {

    Random rand = new Random();

    String nome, colore;
    int velocita, metri;

    public Barca(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
        velocita = 0;
        metri = 0;
    }

    public String toString() {
        return "" + nome + "(" + colore + ") ";
    }

    void cambiaVelocita() {

        velocita = rand.nextInt(6);
        metri = metri + velocita;
    }

    public int getVelocita() {
        return velocita;
    }



}