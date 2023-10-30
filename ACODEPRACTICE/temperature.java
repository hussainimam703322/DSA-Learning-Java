

import java.util.Scanner;

class temper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter temperature");
        float  temperature = sc.nextInt();
        temperature = ((temperature-32)*5)/9;
        System.out.println("temperature is" +" " + temperature);
    }
}