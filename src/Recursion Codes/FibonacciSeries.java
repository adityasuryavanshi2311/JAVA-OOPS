import java.util.*;

public class FibonacciSeries {
	
	public static void printSeries(int number, int a, int b, int c) {
		int i = 0;
	  if(i == number) {
			return;
		}
		System.out.println(c);
		a = b;
		b = c;
		c = a = b;
		printSeries(c);
 	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for series: ");
		int number = input.nextInt();

		int a=0,b=1,c=0;
		
		printSeries(number, a, b, c);
	}
}

