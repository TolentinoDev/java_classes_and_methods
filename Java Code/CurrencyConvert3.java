import java.util.*;
public class CurrencyConvert {
	static double userInput;
	static double convertOut;

	public static void promptUser(){
		Scanner console = new Scanner(System.in);
		
		System.out.println("!!ENTER POSITIVE NUMERICAL VALUES ONLY!!");
		System.out.print("Please enter the amount you would like to convert: $");

		boolean isValid = console.hasNextInt();
			if (isValid == false){System.out.println("Error Reading Value, Please Enter an Integer and Try Again.");
			promptUser();
			}	
		
			double userInput = console.nextDouble();
			if  (userInput <= 0){
					System.out.println("Error Reading Value, Please Enter a Positive Integer and Try Again.\n");
					promptUser();
				}

			else{ 
				convertOut = (userInput*1.36);
				System.out.println("You have $"+ userInput +" in US currency, "+"which converts to $"+convertOut+" in Canadian Currency.");
			}
	}
	
	public static void simple(double amount){
		int fifty, twenty, ten,five, one;
		int quarter, dime, nickel, penny;
		
		
		
	}

			

	public static void main(String[] args) {
		promptUser();

	}

}
