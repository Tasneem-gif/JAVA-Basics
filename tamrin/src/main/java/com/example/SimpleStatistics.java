


package com.example;

import java.util.Scanner; 

public class SimpleStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        int sum = 0;
        int min, max;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i]; 
        }

        min = numbers[0];
        max = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        double avg = (double) sum / n;

        System.out.println("------------------------");
        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.2f\n", avg); 
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        input.close();
    }
}
