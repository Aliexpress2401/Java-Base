public class Cerchio {

    double pGreco = 3.14, raggio, area;


    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public String toString() {
        return "Cerchio [pGreco=" + pGreco + ", raggio=" + raggio + ", area=" + area + "]";
    }


    void area() {

        area = pGreco * (raggio * 2);

    }

}