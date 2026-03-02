import java.util.Scanner;

public class TablePrinting {

  public static void printTable(int number, int i) {

    if(i <= 10) {
      System.out.printf("\n%d X %d = %d", number,i,number*i);
      printTable(number, i+1);
    }
  } 

  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number for print table: ");
    int number = input.nextInt();

    int i = 1;
    printTable(number, i);
  }
}