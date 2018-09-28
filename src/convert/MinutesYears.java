package minutes;
import java.util.Scanner;

public class MinutesYears {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of minutes:");
        long minutes = sc.nextLong(); // the user can enter more than 2.147.483.647 minutes

        System.out.println("Please enter the number of minutes: ");
        // number of minutes converted in a 365 days year
        long year = minutes / 525600;
        //long remainingMinutes = minutes % 525600;
        long day = minutes / 1440; // compute the number of the days

        System.out.println(minutes + " minutes is approximately " + year + " year(s) or " + day + " day(s).");
              }
    }

