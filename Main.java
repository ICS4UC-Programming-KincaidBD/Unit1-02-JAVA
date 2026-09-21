import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final long speed_of_light = 299800000; // in meters per second
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mass of your object: ");
        double mass;
        try {
            mass = scanner.nextDouble();
            if (mass <= 0) {
                System.out.println("Mass must be a positive number.");
                return; // exit the program if mass is not positive
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number for mass.");
            return; // exit the program if input is invalid
        } finally {
            scanner.close(); // close the scanner to prevent resource leak
        }
        
        // E = MC^2
        double energy = mass * speed_of_light * speed_of_light;
        // print output
        System.out.println("The energy of your object is: " + energy + " Joules");
    }
}
