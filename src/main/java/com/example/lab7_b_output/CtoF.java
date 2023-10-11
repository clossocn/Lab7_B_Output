package com.example.lab7_b_output;
import java.util.Scanner;

public class CtoF {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double celsius, fahrenheit;

            do {
                System.out.print("Enter a temperature in Celsius: ");

                if (scanner.hasNextDouble()) {
                    celsius = scanner.nextDouble();
                    fahrenheit = celsiusToFahrenheit(celsius);

                    if (isValidTemperature(celsius)) {
                        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
                        break;
                    } else {
                        System.out.println("Please enter a valid temperature value.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            } while (true);

            scanner.close();
        }

        public static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9/5) + 32;
        }

        public static boolean isValidTemperature(double celsius) {
            return celsius >= -273.15;
        }
}
