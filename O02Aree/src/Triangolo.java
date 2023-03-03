public class Triangolo {

    int base, altezza, area;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;

    }

        public String toString() {
        return "Triangolo [base=" + base + ", altezza=" + altezza + ", area=" + area + "]";

    }


    void area() {

        area = (base * altezza)/2;

    }

}