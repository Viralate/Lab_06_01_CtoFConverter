import java.util.Scanner;

public class CtoF{
    public static void main(String[] args) {
        //initiate scanner and variables
        Scanner scanner = new Scanner(System.in);
        double celsius;

        //process user input
        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                break; // Breaks loop if user input is valid
            } else {
                System.out.println("Invalid Input. Please enter a valid number.");
                scanner.next(); // Clears the invalid input
            }
        } while (true);

        //print results 
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%.2f Celsius is equivalent to %.2f Fahrenheit.\n", celsius, fahrenheit);
    }

    // calculate celsius to fahrenheit
    private static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
}
