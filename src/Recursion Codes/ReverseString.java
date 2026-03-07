import java.util.Scanner;
public class ReverseString { 

  public static void ReversePrint(String word, int length) {
    if(length < 0) {
      return "";
    }
    String newString = word.charAt(length) + ReversePrint(word, length - 1);
    return newString;
  }

  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String name = input.nextLine();
    
    int length = name.length()-1;
    System.out.print("Revese of the word: "+ ReversePrint(name, length));
  } 
}
