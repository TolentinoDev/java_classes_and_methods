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
				System.out.printf("You have $ %.2f",userInput);
				System.out.printf(" in US currency, "+"converts to $ %.2f", convertOut);
				System.out.println(" in Canadian Currency.");
			}
	}
	
	/*System.println("How would you like That?")*/
	
	public static void simple(int amount){
		int hundred,fifty, twenty, ten,five, one;
		hundred = fifty =  twenty = ten = five = one = 0;
		
		if (amount >= 100){
			hundred = amount/100;
			amount -= hundred*100;
		}
		
		if (amount >= 50){
			fifty = amount/50;
			amount -= fifty*50;
		}
		
		if (amount >= 20){
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
		 System.out.println("100 x "+hundred);
		 System.out.println("50  x "+fifty);
		 System.out.println("20  x "+twenty);
		 System.out.println("10  x "+ten);
		 System.out.println("5   x "+five);
		 System.out.println("1   x "+one);
		
		
	}

			

	public static void main(String[] args) {
		promptUser();
		simple((int) convertOut);
	}

}
