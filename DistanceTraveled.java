
import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double speed;
        int hours;

        // Get and validate vehicle speed
        System.out.print("Enter the speed of the vehicle (mph): ");
        speed = input.nextDouble();

        while (speed < 0) {
            System.out.print("Invalid speed. Enter a positive speed: ");
            speed = input.nextDouble();
        }

        // Get and validate hours traveled
        System.out.print("Enter the number of hours traveled: ");
        hours = input.nextInt();

        while (hours < 1) {
            System.out.print("Invalid hours. Enter at least 1: ");
            hours = input.nextInt();
        }

        // Display distance traveled
        System.out.println("\nHour\tDistance Traveled");
        System.out.println("--------------------------");

        for (int i = 1; i <= hours; i++) {
            double distance = speed * i;
            System.out.println(i + "\t" + distance + " miles");
        }

        input.close();
    }
}
