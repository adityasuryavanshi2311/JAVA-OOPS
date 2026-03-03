//Recursion = where function calls it self called recurdion

public class RecursionCode1 {
	
	public static int recurFunction(int number) {
		
		if(number == 6) { // when condition becomes true returns to main 
			return; // returns when matchs condition  
		}
		System.out.println(number); // prints number
		recurFunction(number + 1); // calls it self by passing incremented number
	}
	
	public static void main(String args[]) {
		int number = 1;
		recurFunction(number); // calls function by passing number(1)
	}
}
