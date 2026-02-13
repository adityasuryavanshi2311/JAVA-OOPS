import java.util.*;
import temperature.CToKConversion;
import temperature.CtoFConversion;
import temperature.FToKConversion;
import temperature.FtoCConversion;
import temperature.KToCConversion;
import temperature.KToFConversion;

public class conversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kelvin = 0;
        double fahrenheit = 0;
        double celsius = 0;

        System.out.println("-:- -:- -:- -:- -:- -:- -:- -:- -:- -:-");

        System.out.println("Press 1: Convert Celsius to Fahrenheit");
        System.out.println("Press 2: Convert Fahrenheit to Celsius");
        System.out.println("Press 3: Convert Fahrenheit to Kelvin");
        System.out.println("Press 4: Convert Kelvin to Fahrenheit");
        System.out.println("Press 5: Convert Kelvin to Celsius");
        System.out.println("Press 6: Convert Celsius to Kelvin");
        System.out.println("-:- -:- -:- -:- -:- -:- -:- -:- -:- -:-");

        System.out.print("Select Option: ");
        int option = input.nextInt();

        System.out.print("Enter Temperature: ");
        double temp = input.nextDouble();

        switch(option) {
            case 1:
                fahrenheit = CtoFConversion.CToF(temp);
                System.out.println(temp + "°C = " + fahrenheit + "°F");
                break;
            case 2 :
                celsius = FtoCConversion.FToC(temp);
                System.out.println(temp + "°F = " + celsius + "°C");
                break;
            case 3 :
                kelvin = FToKConversion.FToK(temp);
                System.out.println(temp + "°F = " + kelvin + " K");
                break;
            case 4 :
                fahrenheit = KToFConversion.KToF(temp);
                System.out.println(temp + " K = " + fahrenheit + "°F");
                break;
            case 5 :
                celsius = KToCConversion.KToC(temp);
                System.out.println(temp + " K = " + celsius + "°C");
                break;
            case 6 :
                kelvin = CToKConversion.CToK(temp);
                System.out.println(temp + "°C = " + kelvin + " K");
                break;
            default:
                System.out.println("Please Select Correct Option.");
            }
    }
}