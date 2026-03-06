import java.util.Scanner;

public class PowerOfNumber {

  // function to calculate output
  public static void findPower(int base, int pow) {
    if(pow == 0) {
      return 1;
    }
    if(base == 0){ // base condition if input - 0
      return 0;
    }
    int xPownm1 = findPower(base, pow-1);
    int xPown = base * xPownm1;
    return xPown;
  }

  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

    // input base number from user 
    System.out.print("Enter a base number: ");
    int base = input.nextInt();
    // input number to calculate power
    System.out.print("Enter a power: ");
    int pow = input.nextInt();

    // passing inputs (base number, power to calculate O/P)
    System.out.print(findPower(base, pow)); 
  }
}
