import java.util.InputMismatchException;
import java.util.Scanner;

public class SphereMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input the radius of the sphere you are trying to solve.");
        double radius = doubleInput(keyboard);
        System.out.println("Diameter: " + radius * 2);
        System.out.println("Circumference: " + 2 * Math.PI * radius);
        System.out.println("Surface Area: " + 4 * Math.PI * Math.pow(radius, 2));
        System.out.println("Volume: " + (4 / 3) * Math.PI * Math.pow(radius, 3));
    }

    public static double dInput(Scanner keyboard) { //checks if input is a double. If not, then will give error and force user to retry
        double dOutput = -1;

        while (dOutput == -1) {
            try {
                dOutput = keyboard.nextDouble();

                if (dOutput < 0) {
                    dOutput = -1;
                    System.out.println("You put in a number less than 0. Please try again.");
                }
            } catch (InputMismatchException I) {
                System.out.println("You did not input a number. Please try again.");
                keyboard.next();
            }
        }

        return dOutput;
    }
}
