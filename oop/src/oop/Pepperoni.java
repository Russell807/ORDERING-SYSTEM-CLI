package oop;

import java.util.Scanner;

public class Pepperoni extends Pizza /*Inheritance */ {
	static double pPrize= 299;
	 static int qty;
	 
	 
	 public static void order () /*Polymorphism*/{
		 
			  System.out.println("You selected Pepperoni");


			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter Quantity:");
			  qty = sc.nextInt();
				  
				 
		     ptotal = qty * pPrize;
				
	 }}