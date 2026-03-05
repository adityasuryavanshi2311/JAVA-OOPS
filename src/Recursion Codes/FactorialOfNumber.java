import java.util.*;

public class FactorialOfNumber {
	
	public static int factorialOfNumber(int number, int store){
		
		store *= number;
		if(number == 1) {
			System.out.println(store);
			return store;
		}
		factorialOfNumber(number-1, store);
		return 0;
	}
	
	public static void main(String args[]) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a number for finding factorial: ");
		int number = input.nextInt();
		
		int store = 1;
		factorialOfNumber(number, store);
		// int factorial = factorialOfNumber(number, store);
		// System.out.print("Factorial of number: " + factorial);
		
	}
}



