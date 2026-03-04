//Recursion = where function calls it self called recurdion
import java.util.Scanner;

public class numberPrinting {
	
	public static void recurFunction(int number, int endNum) {
		
		if(number == endNum+1){
			//checks base condition
			return; // returns to main when condition beacomes true
		}
		System.out.println(number); // prints number
		recurFunction(number + 1, endNum); //calls it self by passing incremented number and ending number
	}

	public static void recurFunctionReverse(int number, int endNum) {
		
		if(number == endNum+1){
			//checks base condition
			return; // returns to main when condition beacomes true
		}
		System.out.println(number); // prints number
		recurFunction(number - 1, endNum); //calls it self by passing incremented number and ending number
	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: "); // user input
		int endNum = input.nextInt(); // ending number to stop function

		System.out.println("Enter 1 for ascending order or 2 for descending order: ");
		int userChoice = input.nextInt();
		
		int number = 1; // starting index
		
		if(userChoice == 1) {
			recurFunction(number, endNum);
		}else if(userChoice == 2) {
			recurFunctionReverse(number, endNum);
		}
		else {
			System.out.println("OOPs, Wrong input!");
		}
	}
}
