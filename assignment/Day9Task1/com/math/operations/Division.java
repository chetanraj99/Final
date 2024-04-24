
// Division.java
package com.math.operations;
import java.util.Scanner;
public class Division {
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Perform Division operation
        double result= divide(num1, num2);

        // Print the result
        System.out.println("Division: " + result);

        scanner.close();
    }
}
