//Recursion = where function calls it self called recurdion

public class RecursionCode1 {
	
	public static int recurFunction(int number) {
		
		System.out.println(number);
		if(number < 5) { //runs 5-1 times 
			recurFunction(number + 1); //calls it self by passing incremented number
		}
    return number; //returns 5 when if condition becomes false 
	}
	
	public static void main(String args[]) {
		int number = 1;
		recurFunction(number); // calls function by passing number(1)
	}
}

