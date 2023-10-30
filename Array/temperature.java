package CoreJava.Array;
import java.util.Scanner;

class temperature {
  public static void main(String[] args) {

    System.out.println("Enter temperature in celcius: ");
    Scanner sc = new Scanner(System.in);
    int c =Integer.parseInt(sc.nextLine());
    float f = ((9*c)/5)+32;
    
    System.out.println("Temperature in Fahrenheit is: "+f);
    
  }
}