package temperature;

public class KToFConversion {

  public static double KToF(double kelvin){
    return (kelvin - 273.15) * 9/5 + 32;
  }
}
