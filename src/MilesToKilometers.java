import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        double miles, kilometers;
        final double MILES_TO_KILOMETERS = 1.60935;

        Scanner scanner = new Scanner(System.in);

        // Read miles from the user
        System.out.print("Enter the distance in miles: ");
        miles = scanner.nextDouble();

        // Convert miles to kilometers
        kilometers = miles * MILES_TO_KILOMETERS;

        // Display the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");

        scanner.close();
    }
}