package entities;

public class CurrencyConverter {
	
	public double IOF = 0.06;
	public double dolarPrice;
	public double dolarBuy;
	
	public double converter() {
		return (dolarPrice * dolarBuy) + (dolarPrice * dolarBuy * IOF); 
		
	}

}
