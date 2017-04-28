import java.util.*;
public class CurrencyConvert {
	static double userInput;
	static double convertOut;
	
	// this method prompts the user to input any positive integer 
	public static void promptUser(){
		
	// Scanner is used to read the users input
		Scanner console = new Scanner(System.in);
		
	//Print Statements to Ask/Tell the user what to do 
		System.out.println("!!ENTER POSITIVE NUMERICAL VALUES ONLY!!");
		System.out.print("Please enter the amount you would like to convert: $");
		
	//Takes the user input and validates it is an integer 
		boolean isValid = console.hasNextInt();
			if (isValid == false){System.out.println("Error Reading Value, Please Enter an Integer and Try Again.");
			promptUser();
			
			}	
			
	//Takes user input and validates it is positive
			double userInput = console.nextDouble();
			if  (userInput <= 0){
					System.out.println("Error Reading Value, Please Enter a Positive Integer and Try Again.\n");
					promptUser();
				}
			
	//Takes user input and converts it into a Canadian dollar value 
			else{ 
				convertOut = (userInput*1.36);
				System.out.printf("You have $ %.2f",userInput);
				System.out.printf(" in US currency, "+"converts to $ %.2f", convertOut);
				System.out.println(" in Canadian Currency.");
			}
	}
	
	
	// This method gives the user 6 options to choose from on how they would like their money distributed
	public static void receive(){
		System.out.println("1: simplest form\n"
						 + "2: all fifties\n"
						 + "3: all twenties\n"
						 + "4: all tens\n"
						 + "5: all fives\n"
						 + "6: all ones\n");
		System.out.print("Option number: ");
		//Asks for user input
		boolean valid_option = console.hasNextInt();
		if (valid_option == false) {
			System.out.println("\n Please choose one of the options from below.\n");
			receive();
		}
		//the users options
		else{
			int change = console.nextInt();
			if (change == 1 || change == 2 || change == 3 || change == 4 || change == 5 || change == 6){
			
				if (change == 1)	simple((int)convertOut);
				
				if (change == 2)	all_fifties((int) convertOut);
				
				if (change == 3)	all_twenties((int) convertOut);
				
				if (change == 4)	all_tens((int) convertOut);
				
				if (change == 5) 	all_fives((int) convertOut);
				
				if (change == 6)	all_ones((int) convertOut);
			}
			
			else{
				System.out.println("\n Please choose one of the options from below.\n");
				receive();
			}
		}
		
	}


	//The following method takes the Canadian Dollar value and divides it up into the simplest distribution of bills
	public static void simple(int amount){
		int hundred,fifty, twenty, ten,five, one;
		hundred = fifty =  twenty = ten = five = one = 0;
		
		//Divides money by 100, gives number of hundred dollar bills needed and subtracts the value from the amount
		if (amount >= 100){
			hundred = amount/100;
			amount -= hundred*100;
		}
		
		//Divides money by 50, gives number of fifty dollar bills needed and subtracts the value from the amount
		if (amount >= 50){
			fifty = amount/50;
			amount -= fifty*50;
		}
		
		//Divides money by 20, gives number of twenty dollar bills needed and subtracts the value from the amount
		if (amount >= 20){
			twenty = amount/20;
			amount -= twenty*20;
		}
		
		//Divides money by 10, gives number of ten dollar bills needed and subtracts the value from the amount
		if (amount >= 10){
			ten = amount/10;
			amount -= ten*10;
		}
		
		//Divides money by 5, gives number of five dollar bills needed and subtracts the value from the amount
		if (amount >= 5){
			five = amount/5;
			amount -= five*5;
		}
		
		//Divides money by 1, gives number of single dollar bills needed and subtracts the value from the amount
		if (amount >= 1){
			one = amount/1;
			amount -= one*1;
		}
		 System.out.println("100 x "+hundred);
		 System.out.println("50  x "+fifty);
		 System.out.println("20  x "+twenty);
		 System.out.println("10  x "+ten);
		 System.out.println("5   x "+five);
		 System.out.println("1   x "+one);
		
		
	}

	//Distributes the Canadian Dollar Value in only 50 dollar bills		
	public static void all_fifties(int amount){
		int fifty, twenty, ten, five, one;
		fifty = twenty = ten = five = one = 0;
		
		if (amount >= 50){
			fifty = amount/50;
			amount -= fifty*50;
		}
		
		if(amount >= 20){
			twenty = amount/20;
			amount -= twenty*20;
		}
		
		if (amount >= 10){
			ten = amount/10;
			amount -= ten*10;
		}
		
		if (amount >= 5){
			five = amount/5;
			amount -= five*5;
		}
		
		if (amount >= 1){
			one = amount/1;
			amount -= one*1;
		}
		
		System.out.println("fifty  x "+fifty);
		System.out.println("twenty x "+twenty);
		System.out.println("ten    x "+ ten);
		System.out.println("five   x "+ five);
		System.out.println("one    x "+ one);
		
	}
	 
	//Distributes the Canadian Dollar Value in only 20 dollar bills
	public static void all_twenties(int amount){
		int twenty, ten, five, one;
		twenty = ten = five = one = 0;
		
		if(amount >= 20){
			twenty = amount/20;
			amount -= twenty*20;
		}
		
		if (amount >= 10){
			ten = amount/10;
			amount -= ten*10;
		}
		
		if (amount >= 5){
			five = amount/5;
			amount -= five*5;
		}
		
		if (amount >= 1){
			one = amount/1;
			amount -= one*1;
		}
		
		System.out.println("twenty x "+twenty);
		System.out.println("ten    x "+ ten);
		System.out.println("five   x "+ five);
		System.out.println("one    x "+ one);
		
	}
	
	//Distributes the Canadian Dollar Value in only 10 dollar bills
	public static void all_tens(int amount){
		int ten, five, one;
		ten = five = one = 0;
		
		
		if (amount >= 10){
			ten = amount/10;
			amount -= ten*10;
		}
		
		if (amount >= 5){
			five = amount/5;
			amount -= five*5;
		}
		
		if (amount >= 1){
			one = amount/1;
			amount -= one*1;
		}
		
		System.out.println("ten    x "+ ten);
		System.out.println("five   x "+ five);
		System.out.println("one    x "+ one);	
	}
	
	//Distributes the Canadian Dollar Value in only 5 dollar bills
	public static void all_fives(int amount){
		int five, one;
		five = one = 0;
		
		if (amount >= 1){
			five = amount/5;
			amount -= five*5;
		}
		
		if (amount >= 1){
			one = amount/1;
			amount -= one*1;
		}
		
		System.out.println("five   x "+ five);
		System.out.println("one    x "+ one);
		
	}
	
	//Distributes the Canadian Dollar Value in only single dollar bills
	public static void all_ones(int amount){
		int one;
		one = 0;
		
		if (amount >= 1){
			one = amount/1;
			amount -= one*1;
		}
		
		System.out.println("one    x "+ one);
		
	}

	
	public static void main(String[] args) {
		promptUser();
		simple((int) convertOut);
	}

}
