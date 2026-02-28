import java.util.*;
public class BubbleSort{

  //soring in ascending order by function calling
  public static void sortingInAscendingOrder(int array[]) {

    Scanner input = new Scanner(System.in);

     for(int i=0; i<array.length-1; i++) {
      System.out.printf("Enter Element no %d: ", i);
      array[i] = input.nextInt();
    }
      
    for(int i=0; i<array.length-1; i++) {
      for(int j=0; j<array.length-1-i; j++) {
        if(array[j] > array[j+1]) {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
  }

  //sorting in descending order by function calling 
  public static void sortingInDescendingOrder(int array[]) {
    
    Scanner input = new Scanner(System.in);

    for(int i=0; i<array.length-1; i++) {
      System.out.printf("Enter Element no %d: ", i);
      array[i] = input.nextInt();
    }

    for(int i=array.length-1; i>=0; i--) {
      for(int j=array.length-1-i; j>=0; j++) {
        if(array[j] < array[j+1]) {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
  }

  public static void printArray(int array[]) {

    for(int i=0; i<array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter no. of Elements: ");
    int size = input.nextInt();

    int[] array = new int[size];

    System.out.print("Press 1 for Ascending order or 2 for decending order: ");
    int userChoice = input.nextInt();

    if(userChoice == 1) {
      sortingInAscendingOrder(array);
    } else if(userChoice == 2) {
      sortingInDescendingOrder(array);
    } else {
      System.out.println("Invalid user input");
    }
  }
}
