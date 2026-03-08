import java.util.*;

public class SumOfDigits {
	
	public static int addDigits(int number) {
		if(number == 0) {
			return 0;
		}
		return (number % 10) + addDigits(number / 10);
	}
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print(addDigits(number));
		
	}
}





