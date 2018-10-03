package FlowControl;
import java.util.Scanner;

public class TriangleEx {
    public static void main(String[] args) {
        /*exercise #5.3 3) triangle equilateral or isosceles, scalene
         */
        int side1, side2, side3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of the triangle: ");
        side1 = sc.nextInt();
        side2 = sc.nextInt();
        side3 = sc.nextInt();

        if ((side1 == side2) && (side2 == side3)) {
            System.out.println("The triangle is equilateral");
        } else if ((side1 == side2)||(side2 == side3) || (side1 == side3)) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is scalene");
        }

    }
}