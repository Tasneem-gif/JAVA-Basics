package com.example;
import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.print("Enter a character: ");
        char c = input.next().charAt(0); 

        System.out.println("\nRight Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { 
                System.out.print(c);
            }
            System.out.println(); 
        }


        System.out.println("\nHollow Square:");
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(c);
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }


        System.out.println("\nX Shape:");
        for (int i = 0; i < n; i++) {       
            for (int j = 0; j < n; j++) {    
                if (i == j || i + j == n - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}

