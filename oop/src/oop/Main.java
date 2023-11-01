package oop;
import java.util.Scanner;
public class Main {

	
	
	 public static void main(String[] args) {
	        //Class Instantiation
			Hawaiian h = new Hawaiian();
			Pepperoni p = new Pepperoni();
			Veggie v = new Veggie();
		  
			
			
			
			
		
			
			// Program Flow
			Pizza.menu();
			Pizza.order();
			drinkMenu();
			chooseDrinks();
			
		
		}
	 public static void drinkMenu(){
		    System.out.println("\t\t\t\t+===================================+");
		    System.out.println("\t\t\t\t           DRINKS MENU          ");
		    System.out.println("\t\t\t\t   1. Pineapple Juice               Php. 70.00");
		    System.out.println("\t\t\t\t   2. Coca cola                     Php. 65.00");
		    System.out.println("\t\t\t\t   3. Buko Juice                    Php. 50.00");
		    System.out.println("\t\t\t\t   4. No Drinks                          ");
		    System.out.println("\t\t\t\t+====================================+");
		    }
	 public static void chooseDrinks() {
		 PineappleJuice pj = new PineappleJuice();
		 CocaCola coke = new CocaCola();
		 BukoJuice bj = new BukoJuice();
			Scanner sc = new Scanner(System.in);
		    System.out.println("Press 1 to Pineapple Juice   , Press 2 to Coca cola    , Press 3 to Buko Juice and Press 4 to check out ");
			System.out.print("Press you want to buy? :");
			int choice = sc.nextInt();
			    
			    if(choice==1) {
			       pj.orderDrinks();
			    } else if (choice==2) {
			    	coke.orderDrinks();
			    } else if (choice==3) {
			    	bj.orderDrinks();
			    } else if (choice==4){
			    	Pizza pizza = new Pizza();
					pizza.checkOut();
			    }
	

}
}
