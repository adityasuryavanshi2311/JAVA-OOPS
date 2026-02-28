public class BubbleSort{

  public static void main(String args[]) {

    int[] array = {43, 32, 79, 29, 12};

    for(int i=0; i<array.length-1; i++) {
      for(int j=0; j<array.length-1-i; j++) {
        if(array[j] > array[j+1]) {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
    printArray(array);
  }

  public static void printArray(int array[]) {

    for(int i=0; i<array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}