package circulo;

public class Circulo {
	double diametro;
	
	public Circulo(double x) {
		diametro = x;
	}
	
	public double dobra() {
		return diametro*2;
	}
	
	public String toString() {
		return "Employee: " + dobra();
	}

}
