import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        //declare scanner and variables
        Scanner scanner = new Scanner(System.in);
        double celsius;

        //process user input
        while(true) {
            System.out.print("Enter the tempature in Celsius: ");
            try {
                celsius = Double.parseDouble(scanner.nextLine());
                break; //breaks loop if user input is invalid
            } catch (NumberFormatException e) {
                System.out.print("Invalid Input. Please enter a valid number.");
            }
        }
        //print results 
        double farenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%.2f Celsius is equvalent to %.2f Farenheit.\n", celsius, farenheit);
    }

    // caluclate celsius to farenheit
    private static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
}
