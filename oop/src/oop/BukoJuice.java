package oop;

import java.util.Scanner;

public class BukoJuice extends Drinks /*Inheritance*/ {
	
	static double dPrize = 50;
	static int dqty;
	static double dpayment;
    
	
	
	@Override
	void orderDrinks()/*Polymorphism*/ {
		 System.out.println("You selected Buko Juice");
			
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Quantity:");
		  dqty = sc.nextInt();
		 double dt = dqty * dPrize;
		 
		 double ta = total(dqty,dPrize);
		
			
		 System.out.println("Total: " + ta);
		 System.out.println("Enter Payment:");
		  dpayment = sc.nextDouble();
		  double c = total(dqty, dPrize, dpayment); 
		  if (dpayment<ta) {
				System.out.println("Order Cancelled, Not enough payment. \nPlease reload the program to restart the ordering process");
			} else if (dpayment>ta) {
				
				System.out.println("Ordered Succesfully");
				System.out.println("Pizza Bill: " + Pizza.ptotal);
				System.out.println("Drinks Bill " + dt);
				System.out.println("Total amount " + ta);
				System.out.println("Change: " + c);
			}
	


}
public static double total(double dqty, double dPrize) { // Method Overloading
	return (dqty * dPrize) + Pizza.ptotal;
}
public static double total(double dqty, double dPrize, double dpayment) { // Method Overloading
	return(dpayment-((dqty * dPrize )+ Pizza.ptotal)  ) ;
}

}


