package oop;

import java.util.Scanner;

public class Hawaiian extends Pizza  /*Inheritance */{
	
 static double pPrize = 320;
 static int qty;
 

	
   public static void order /*Polymorphism*/() {
	  System.out.println("You selected Hawaiian");


	  Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Quantity:");
		  qty = sc.nextInt();
		  
		 
		   ptotal = qty * pPrize;
		
		 	 
		 
   }  

}
