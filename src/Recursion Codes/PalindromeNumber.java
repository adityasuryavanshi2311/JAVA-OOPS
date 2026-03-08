import java.util.Scanner;

public class PalindromeNumber {

    public static int reverseNumber(int num) {

        // Base condition
        if (num == 0) {
            return reverse;
        }
        reverse = reverse * 10 + num % 10;
        return reverseNumber(num / 10);
    }

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int number = input.nextInt();

      int reversed = reverseNumber(number);

      if (number == reversed) {
          System.out.println("Palindrome Number");
      } else {
          System.out.println("Not a Palindrome Number");
      }
  }
}