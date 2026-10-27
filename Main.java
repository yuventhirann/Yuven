
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create the first car using the parameterized constructor
        Car myCar = new Car(
            "Toyota", "Camry", 2024, 150000.0,
            false, 0, 50.0
        );

        // Create the second car using the default constructor
        Car customCar = new Car();

        // Use setter methods to update the second car's attributes
        customCar.setBrand("Honda");
        customCar.setModel("Civic");
        customCar.setYear(2025);
        customCar.setPrice(130000.0);
        customCar.setFuelLevel(30.0);
        customCar.setIsEngineOn(false);
        customCar.setCurrentSpeed(0);

        // Use getter methods to display car information
        System.out.println("My Car Brand: " + myCar.getBrand());
        System.out.println("Custom Car Model: "
                           + customCar.getModel());

        // Call the method to start the car engine
        myCar.startEngine();

        // For loop: accelerate the car three times
        for (int i = 0; i < 3; i++) {
            myCar.accelerate(20);
        }

        // Scanner allows the user to enter a menu choice
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "\nEnter 1 to check fuel level, 2 to stop the car:"
        );

        // Check that the input is a valid integer
        if (scanner.hasNextInt()) {

            int choice = scanner.nextInt();

            // Switch statement selects an operation
            switch (choice) {
                case 1:
                    System.out.printf(
                        "Fuel Level: %.1f%%%n",
                        myCar.getFuelLevel()
                    );
                    break;

                case 2:
                    myCar.stopEngine();
                    break;

                default:
                    System.out.println("Invalid input.");
            }

        } else {
            System.out.println(
                "Invalid input. Please enter a number."
            );
        }

        // Close the Scanner
        scanner.close();
    }
}
