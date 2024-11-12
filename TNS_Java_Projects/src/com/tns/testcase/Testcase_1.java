package com.tns.testcase;

import java.util.Scanner;

public class Testcase_1 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Test Case 1:");
	        System.out.print("Enter the number: ");
	        int n = scanner.nextInt();
	        System.out.println();
	        printPattern(n);
	        scanner.close();
	    }

	    // Function to print the pattern for Test Case 1
	    public static void printPattern(int n) {
	        // Print the first row (1 to n)
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        // Print the middle part
	        for (int i = 2; i < n; i++) {
	            System.out.print(i + " ");
	            // Print spaces between the numbers
	            for (int j = 2; j <= n; j++) {
	                System.out.print("  ");
	            }
	            System.out.print(n - i + 1);
	            System.out.println();
	        }

	        // Print the last row (n to 1)
	        for (int i = n; i >= 1; i--) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	    

}
