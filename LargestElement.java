package com.hem.dsapractice;

public class LargestElement {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23};

        int largest = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest Element: " + largest);
    }
}
