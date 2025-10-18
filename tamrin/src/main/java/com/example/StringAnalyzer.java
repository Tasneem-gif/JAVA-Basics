package com.example;

import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String text = input.nextLine(); 

        int vowels = 0;  
        int letters = 0; 
        int digits = 0;  
        int spaces = 0;  

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') { 
                letters++;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++; 
            } else if (ch == ' ') {
                spaces++; 
            }
        }

        String[] words = text.trim().split("\\s+");
        int wordCount = (text.trim().isEmpty()) ? 0 : words.length;

        System.out.println("vowels=" + vowels);
        System.out.println("letters=" + letters);
        System.out.println("digits=" + digits);
        System.out.println("spaces=" + spaces);
        System.out.println("words=" + wordCount);

        input.close();
    }
}

