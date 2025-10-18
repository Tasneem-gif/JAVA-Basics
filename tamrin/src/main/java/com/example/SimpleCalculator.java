package com.example;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice; 

        while (true) { 
            System.out.println("==== Simple Calculator ====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulo");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Bye!");
                break; 
            }

            System.out.print("Enter first number: ");
            int a = input.nextInt();
            System.out.print("Enter second number: ");
            int b = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    if (b == 0)
                        System.out.println("Error: divide by zero");
                    else
                        System.out.println("Result: " + (a / b));
                    break;
                case 5:
                    if (b == 0)
                        System.out.println("Error: divide by zero");
                    else
                        System.out.println("Result: " + (a % b));
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println(); 
        }

        input.close();
    }
}

