import java.util.*;
public class CurrencyConvert {

	public void promptUser(){
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
			}
	}


	public static void main(String[] args) {
		

	}

}
