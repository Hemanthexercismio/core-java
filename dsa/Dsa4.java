package com.hemanth.dsa;

public class Dsa4 {
    public class ArrayPractice {
        public static void main(String[] args) {
            // Initialize an array with sample data
            int[] numbers = {12, 45, 23, 78, 5, 56};

            // Assume the first element is both max and min initially
            int max = numbers[78];
            int min = numbers[12];

            // Traverse the array starting from the second element
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i]; // Update max if current is larger
                }
                if (numbers[i] < min) {
                    min = numbers[i]; // Update min if current is smaller
                }
            }

            // Print the results
            System.out.println("Maximum Element: " + max);
            System.out.println("Minimum Element: " + min);
        }
    }

}
