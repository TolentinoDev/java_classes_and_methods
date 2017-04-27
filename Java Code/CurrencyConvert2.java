import java.util.*;
public class CurrencyConvert {

	public static void promptUser(){
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please enter the amount you would like to convert.");
		System.out.println("ENTER NUMERICAL VALUES ONLY");
		
		boolean isValid = console.hasNextDouble();
			if (isValid == false){System.out.println("Error reading value, Please Try Again");
			promptUser();
			}		
			else{ 
				double userInput = console.nextDouble();
				double convertOut = userInput*1.36;
				System.out.println("You have $"+userInput+" in US currency, "+"which converts to $"+convertOut+" in Canadian Currency.");
			}
	}


	public static void main(String[] args) {
		promptUser();

	}

}
