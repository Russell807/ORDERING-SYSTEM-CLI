package oop;

import java.util.Scanner;

public class Pizza extends Main implements CheckOut {
	private double pPrize; // Encapsulation
	private int qty;
	public static double ptotal;
	static double ppayment;
	
	 public static void menu(){
		    System.out.println("\t\t\t\t+===================================+");
		    System.out.println("\t\t\t\t           Pizza MENU          ");
		    System.out.println("\t\t\t\t   1. Hawaiian               Php. 320.00");
		    System.out.println("\t\t\t\t   2. Pepperoni              Php. 299.00");
		    System.out.println("\t\t\t\t   3. Veggie                 Php. 250.00");
		    System.out.println("\t\t\t\t   4. CANCEL                         ");
		    System.out.println("\t\t\t\t+====================================+");
		    }

	 public static void order() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Press 1 to Hawaiian  , Press 2 to Pepperoni   , Press 3 to  Veggie and Press 4 to Cancel");
		System.out.print("Press you want to buy? :");
		int choice = sc.nextInt();
		    
		    if(choice==1) {
		    	Hawaiian.order();
		    } else if (choice==2) {
		    	Pepperoni.order();
		    } else if (choice==3) {
		    	Veggie.order();
		    } else if (choice==4){
		    	System.exit(0);
		    }
	 } 

	public void setpPrize(double pPrize) {
		pPrize = pPrize;
	}
	public double getpPrize() {
		return pPrize;
	} 
	public void setQTY(int qty) {
		qty = qty;
	}
	public int getQTY() {
		return qty;
	} 
	public void setpPayment(double ppayment) {
		ppayment = ppayment;
	}
	public double getpPayment() {
		return ppayment;
	} 
	@Override
	public void checkOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total: " + ptotal);
		System.out.println("Please Enter Your Payment");
		ppayment = sc.nextDouble();
		
		
		if (ppayment<ptotal) {
			System.out.println("Order Cancelled, Not Enough Payment");
			System.out.println("Please reload the program to restart your order ");
		} else {
			double change = ppayment - ptotal;
			System.out.println("Ordered Successfully");
			System.out.println("Total Amount: " + ptotal);
			System.out.println("Change: " +change );
		}
		
	
}
	
}
