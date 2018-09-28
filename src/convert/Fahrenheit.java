package convert;
import java.util.Scanner;

public class Fahrenheit {
   public static void main(String[] args) {
   int celsius, fahrenheit;
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter temperature in fahrenheit scale:");

   fahrenheit = sc.nextInt();
    // the formula to convert temperature is : fahrenheit (°F) minus 32, times 5/9:
    celsius = ((fahrenheit - 32) * 5) / 9;

    System.out.println(fahrenheit + " ºF " + "is: " + celsius + " ºC");
        }

}
