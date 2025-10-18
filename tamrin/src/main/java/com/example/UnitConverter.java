package com.example;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double value, result;

        while (true) { 
            System.out.println("==== Unit Converter ====");
            System.out.println("1. Celsius → Fahrenheit");
            System.out.println("2. Fahrenheit → Celsius");
            System.out.println("3. Kilometer → Mile");
            System.out.println("4. Mile → Kilometer");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Bye!");
                break; 
            }

            System.out.print("Enter value: ");
            value = input.nextDouble();

            switch (choice) {
                case 1: 
                    result = value * 1.8 + 32;
                    System.out.printf("Result: %.2f%n", result);
                    break;
                case 2:
                    result = (value - 32) / 1.8;
                    System.out.printf("Result: %.2f%n", result);
                    break;
                case 3: 
                    result = value * 0.621371;
                    System.out.printf("Result: %.2f%n", result);
                    break;
                case 4: 
                    result = value / 0.621371;
                    System.out.printf("Result: %.2f%n", result);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println(); 
        }

        input.close();
    }
}

    

