package FlowControl;

import java.util.Scanner;

public class EquatQuadr {
    public static void main(String[] args) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c of the equation: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    double root1, root2, discr;
    discr = (b * b) - 4 * a * c;

        if (discr > 0) {
        root1 = (-b - Math.sqrt(discr)) / (2*a);
        root2 = (-b + Math.sqrt(discr)) / (2*a);
        System.out.println("Root 1 is equal to " + root1);
        System.out.println("Root 2 is equal to " + root2);
    }  else if (discr == 0) {
        root1 = (-b + Math.sqrt(discr)) / (2 * a);
        System.out.println("Root 1 and Root 2 are equal and are " + root1);
    } else {
            System.out.println("Roots are not real");
        }
    }
}
