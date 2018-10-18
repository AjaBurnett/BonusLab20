import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


//bonus lab
//aja burnett
//18 Oct 18

public class BonusLab {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] vitamin = {"VitaminB  ", "VitaminB12", "VitaminC   ", "Chasteberry ", "VitaminD   ", "Echinacea   ", "Elderberry  ", "Zinc        "};
		Double[] price = {5.49, 3.99, 3.29, 7.99, 1.99, 12.49, 13.99, 4.99};
		
		System.out.println("  Welcome to The Vitamin Hub");
		System.out.println();
		showItems();
		
       
		System.out.println();
		
		String another;
		ArrayList<String> shoppingCart= new ArrayList<String>();
		
		do {
		System.out.println("What would you like to order?");
		String userChoice= scan.next();
		
		if (userChoice.equalsIgnoreCase ("VitaminB")){
				System.out.println("You ordered " + vitamin[0] + " for " + price[0]);
				shoppingCart.add(vitamin[0] + price[0] + "\n");
	}else if (userChoice.equalsIgnoreCase ("VitaminB12")){
				System.out.println("You ordered " + vitamin[1] + " for " + price[1]);
				shoppingCart.add(vitamin[1] + price[1] + "\n");
    }else if (userChoice.equalsIgnoreCase ("VitaminC")){
				System.out.println("You ordered " + vitamin[2] + " for " + price[2]);	
				shoppingCart.add(vitamin[2] + price[2]);
    }else if (userChoice.equalsIgnoreCase ("Chasteberry")){
				System.out.println("You ordered " + vitamin[3] + " for " + price[3]);
				shoppingCart.add(vitamin[3] + price[3]);
    }else if (userChoice.equalsIgnoreCase ("VitaminD")){
				System.out.println("You ordered " + vitamin[4] + " for " + price[4]);
				shoppingCart.add(vitamin[4] + price[4]);
    }else if (userChoice.equalsIgnoreCase ("Echinacea")){
				System.out.println("You ordered " + vitamin[5] + " for " + price[5]);
				shoppingCart.add(vitamin[5] + price[5]);
    }else if (userChoice.equalsIgnoreCase ("Elderberry")){
				System.out.println("You ordered " + vitamin[6] + " for " + price[6]);
				shoppingCart.add(vitamin[6] + price[6]);
    }else if (userChoice.equalsIgnoreCase ("Zinc")){
				System.out.println("You ordered " + vitamin[7] + " for " + price[7]);
				shoppingCart.add(vitamin[7] + price[7]);
	}else {System.out.println("Sorry. We don't have " + userChoice);}
		
	
		{System.out.println("Would you like another item? (yes/no)");
	another = scan.next();}
		}while (another.equalsIgnoreCase("yes"));
		 
		if (another.equalsIgnoreCase("no"))
		System.out.println("Here is your Shopping Cart");	
	
		
		
		
		
		System.out.println();
	shoppingCart.forEach(System.out::println);
	
	for (int i = 0; i < price.length; i++) {
	}
	}
	
			
	
	
	
	
		
	

	private static String getString(Scanner scan, String prompt) {
		// TODO Auto-generated method stub
		return null;
	}



	public static void showItems() {
		System.out.println("Item                         Price");
		System.out.println("==================================");
		
		String[] vitamin = {"VitaminB  ", "VitaminB12", "VitaminC   ", "Chasteberry ", "VitaminD   ", "Echinacea   ", "Elderberry  ", "Zinc        "};
		Double[] price = {5.49, 3.99, 3.29, 7.99, 1.99, 12.49, 13.99, 4.99};
		
		for (int i = 0; i<vitamin.length; i++) {
			System.out.println( vitamin[i] +"           "+ price[i]);}
	}
	
	
	
	
}

