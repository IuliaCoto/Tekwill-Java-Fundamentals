package FlowControl;
import java.util.Scanner;

public class PositivNegativ {
    public static void main(String[] args) {
        /* exercise #5.3. 1) number positive or negative
         */
        int myNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        myNumber = sc.nextInt();

        if (myNumber > 0) {
            System.out.println("The number is positive");
            } else {
            System.out.println("The number is negative");
        }
    }
}
