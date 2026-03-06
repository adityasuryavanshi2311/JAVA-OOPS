import java.util.*;

public class FibonacciSeries {
	
	public static void printSeries(int number, int a, int b) {
	  	if(number == 0) {
			return;
		}
		int c = a + b;
		System.out.println(c);
		printSeries(number-1, b, c);
 	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for series: ");
		int number = input.nextInt();

		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
;		printSeries(number, a, b);
	}
}

