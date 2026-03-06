import java.util.Scanner;

public class PowerOfNumber {

  // function to calculate output
  public static void findPower(int base, int pow) {
    int i = 2;
    if(i == pow) {
      System.out.print(base);
      return;
    }
    base = base * i;
    findPower(base, i+1);
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
    findPower(base, pow); 
  }
}