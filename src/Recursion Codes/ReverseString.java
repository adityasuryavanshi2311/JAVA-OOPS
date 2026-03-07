public class ReverseString { 

  public static void ReversePrint(String name, int length) {
    if(length == 0) {
      return;
    }
    String newString = "";
    newString = newString + name.charAt(length);
    ReversePrint(newString, length-1);
  }

  public static void main(String args[]) {

    String name  = "JAVA";
    int length = name.length()-1;
    ReversePrint(name, length);
    
  } 
}