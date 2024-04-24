public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};

        // Calculate sum using SumArray function
        int sum = SumArray(array, 0);

        // Display the sum
        System.out.println("Sum of array elements: " + sum);
    }

    // Recursive function to calculate sum of array elements
    public static int SumArray(int[] array, int index) {
        // Base case: if index reaches the end of the array
        if (index == array.length) {
            return 0;
        }

        // Recursive call to SumArray function for the rest of the array
        // Add current element to the sum of remaining elements
        return array[index] + SumArray(array, index + 1);
    }
}
