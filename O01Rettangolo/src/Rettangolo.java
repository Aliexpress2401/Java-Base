
public class Rettangolo {
		//proprietà
	
	int base;
	int altezza;
	int perimetro;
	int area;
	
		//costruttori
	
	Rettangolo(int b, int a){
		base = b;
		altezza = a;
	}
		//metodi
	
	void perimetro() {
		perimetro = 2*(base + altezza);
	}
	void area() {
		area = base*altezza;
	}
}
