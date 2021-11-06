package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalaty() {
		return grossSalary - tax;
	}
	
	public void IncraseSalaty(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return "Employee: " + name + ", $" + netSalaty();
	}

}
