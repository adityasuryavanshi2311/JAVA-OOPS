import java.util.*;

public class FactorialOfNumber {
	
	public static int factorialOfNumber(int number){

		if(number == 1 || number == 0) {;
			return 1;
		}
		int fact = factorialOfNumber(number-1);
		fact = number * fact;
		return fact;
	}
	
	public static void main(String args[]) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a number for finding factorial: ");
		int number = input.nextInt();
		
		int factorial = factorialOfNumber(number);
		System.out.print("Factorial of number: " + factorial);
		
	}
}
