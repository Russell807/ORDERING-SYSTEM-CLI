package oop;

public abstract class Drinks // Abstraction
{
	private double dPrize; // Encapsulation
	private int dqty;
	private double dpayment;
	
	// GetSet methods
	public void setdPrize(double dPrize) {
		dPrize = dPrize;
	}
	public double getdPrize() {
		return dPrize;
	} 
	public void setdQTY(int dqty) {
		dqty = dqty;
	}
	public int getdQTY() {
		return dqty;
	} 
	public void setdPayment(double dpayment) {
		dpayment = dpayment;
	}
	public double getdPayment() {
		return dpayment;
	} 

	abstract void orderDrinks();
}
