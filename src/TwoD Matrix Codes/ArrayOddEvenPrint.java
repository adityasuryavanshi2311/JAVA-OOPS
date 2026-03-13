import java.util.Scanner;

class ArrayOddEvenPrint {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number for how many numbers you want to store: ");
    int number = input.nextInt();

    int[] array = new int[number];

    for(int i = 0; i < number; i++){
      array[i] = i + 1;
    }

    input.nextLine();
    System.out.print("Enter you want Even/Odd number(E - for even/ O - for odd): ");
    String in = input.nextLine().toUpperCase();

    if(in.equals("E")) {
      for(int i = 0; i <= array.length - 1; i+=2) {
        System.out.print(array[i] + " ");
      }
    }
    else if(in.equals("O")){
      for(int i = 0 + 1; i <= array.length - 1; i+=2) {
        System.out.print(array[i] + " ");
      }
    }
    else {
      System.out.println("Invalid input.");
    }
  }
}