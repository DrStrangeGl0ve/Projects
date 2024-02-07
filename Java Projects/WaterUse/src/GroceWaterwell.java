
import java.util.Scanner;

public class GroceWaterwell {

    public static void main(String[] args) {
        // declares a new scanner which will read for user input.
        Scanner userInput = new Scanner(System.in);

        // prompts the user for the radius and waits for the input.
        System.out.print("Enter the radius of the well casing in feet: ");
        float radius = userInput.nextFloat();

        // prompts the user for the depth and waits for the input.
        System.out.print("Enter the depth of the well in feet: ");
        float depth = userInput.nextFloat();

        // Calls the functions to calculate the volume and convert it to gallons.
        double volume = calculateVolume(radius, depth);
        double gallons = convertToGallons(volume);

        // outputs the number of gallons stored in the well casing.
        System.out.println("The number of gallons stored in the well casing is: " + gallons);
        userInput.close();
    }

    // Calculates the volume of the well casing.
    public static double calculateVolume(double radius, double depth) {
        double volume = Math.PI * radius * radius * depth;
        return volume;
    }

    // Converts the volume of the well casing to gallons.
    public static double convertToGallons(double volume) {
        double gallons = volume * 7.48;
        // Round the gallons to the hundredths place
        gallons = Math.round(gallons * 100.0) / 100.0;
        return gallons;
    }

}
