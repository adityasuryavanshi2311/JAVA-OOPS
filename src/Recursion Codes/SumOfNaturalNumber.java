import java.util.*;

public class SumOfNaturalNumber {

  public static void sumOfNaturalNumber(int i, int number, int sum) {

    if(i == number){
      sum +=i;
      System.out.println(sum);
      return;
    }
    sum += i;
    sumOfNaturalNumber(i+1, number, sum);
  }
 
  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    sumOfNaturalNumber(1,number, 0);
  }
}