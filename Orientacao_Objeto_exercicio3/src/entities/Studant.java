package entities;

public class Studant {
	
	public String name;
	public double trim1;
	public double trim2;
	public double trim3;
	
	public double nota() {
		return trim1 + trim2 + trim3;
	}
	
	public double reprovado() {
		return 60 - nota();
	}

}
