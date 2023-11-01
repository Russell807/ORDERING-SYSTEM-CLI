package oop;

import java.util.Scanner;

public class Veggie extends Pizza /*Inheritance */{
	static double pPrize= 250;
	 static int qty;
	
	 
	  public static void order () /*Polymorphism*/{
		  System.out.println("You selected Veggie");


		  Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Quantity:");
			  qty = sc.nextInt();
			  
			 
			   ptotal = qty * pPrize;
	  }
	
	 }