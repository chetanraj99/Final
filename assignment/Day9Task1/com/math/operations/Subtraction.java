// Subtraction.java
package com.math.operations;
import java.util.Scanner;
public class Subtraction {
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Perform Subtraction operation
        int result = subtract(num1, num2);

        // Print the result
        System.out.println("Subtraction: " + result);

        scanner.close();
    }
}