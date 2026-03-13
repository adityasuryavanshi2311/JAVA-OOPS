import java.util.Scanner;

public class ElementSearching2D {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int rows = input.nextInt();

    System.out.print("Enter number of columns: ");
    int cols = input.nextInt();

    int[][] matrix = new int[rows][cols];

    // input
    // rows
    for(int i=0; i<rows; i++){
      // columns
      for(int j=0; j<cols; j++) {
        System.out.printf("Enter value of index %d,%d : ",i+1,j+1);
        matrix[i][j] = input.nextInt();
      }
    }

    System.out.print("\nEnter value of finding in matrix: ");
    int value = input.nextInt();

    // output
    for(int i=0; i<rows; i++) {
      for(int j=0; j<cols; j++) {
        if(matrix[i][j] == value) {
          System.out.printf("value found at index %d,%d\n", i+1,j+1);
          break;
        } else {
          System.out.println("value not found.");
        }
      }
    }
      
  }
}
