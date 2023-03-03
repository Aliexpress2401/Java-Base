public class Rettangolo {

    int base, altezza, area;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;

    }


    public String toString() {
        return "Rettangolo [base=" + base + ", altezza=" + altezza + ", area=" + area + "]";
    }

    void area() {

        area = base * altezza;

    }

}