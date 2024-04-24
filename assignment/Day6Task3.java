import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Part a) Test SliceArray method
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int startIndex = 2;
        int endIndex = 7;
        int[] slicedArray = SliceArray(originalArray, startIndex, endIndex);
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Sliced Array from index " + startIndex + " to " + endIndex + ": " + Arrays.toString(slicedArray));

        // Part b) Test Fibonacci sequence generation
        int n = 10; // Generate first 10 Fibonacci numbers
        int[] fibonacciArray = generateFibonacciArray(n);
        System.out.println("\nFirst " + n + " Fibonacci numbers: " + Arrays.toString(fibonacciArray));
    }

    // Part a) SliceArray method
    public static int[] SliceArray(int[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex + 1;
        int[] slicedArray = new int[length];
        for (int i = 0; i < length; i++) {
            slicedArray[i] = array[startIndex + i];
        }
        return slicedArray;
    }

    // Part b) Recursive function to find nth Fibonacci number and store in an array
    public static int[] generateFibonacciArray(int n) {
        int[] fibonacciArray = new int[n];
        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = fibonacci(i);
        }
        return fibonacciArray;
    }

    // Recursive function to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
