package entities;

public class CurrencyConverter {
	
	public double dolarPrice;
	public double dolarBuy;
	
	public double converter() {
		return (dolarPrice * dolarBuy) + (dolarPrice * dolarBuy * 0.06); 
		
	}

}
