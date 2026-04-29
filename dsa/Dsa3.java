package com.hemanth.dsa;

public class Dsa3 {

    public static void main(String[] args) {

    }
    public class LinearSearchExample {
        public static void main(String[] args) {
            // 1. Data Structure: Simple integer array
            int[] numbers = {10, 25, 30, 45, 50};

            // 2. Algorithm: Searching for a target value
            int target = 45;
            int resultIndex = -1;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == target) {
                    resultIndex = i; // Found the target
                    break;
                }
            }

            // Output the result
            if (resultIndex != -1) {
                System.out.println("Element " + target + " found at index: " + resultIndex);
            } else {
                System.out.println("Element not found.");
            }
        }
    }

}
