public class Main {
    public static void main(String[] args) {
        // Part a) Sorting using BruteForceSort
        int[] arrayToSort = InitializeArray(); // Initialize array
        System.out.println("Array before sorting:");
        PrintArray(arrayToSort); // Print array before sorting
        BruteForceSort(arrayToSort); // Sort array
        System.out.println("\nArray after sorting using Brute Force Sort:");
        PrintArray(arrayToSort); // Print array after sorting

        // Part b) Linear search using PerformLinearSearch
        int[] arrayToSearch = {10, 20, 30, 40, 50};
        int targetElement = 30;
        int index = PerformLinearSearch(arrayToSearch, targetElement);
        if (index != -1) {
            System.out.println("\nElement " + targetElement + " found at index: " + index);
        } else {
            System.out.println("\nElement " + targetElement + " not found in the array.");
        }
    }

    // Part a) Brute Force Sort function
    public static void BruteForceSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Part b) Linear Search function
    public static int PerformLinearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return index if target element found
            }
        }
        return -1; // Return -1 if target element not found
    }

    // Function to initialize an array
    public static int[] InitializeArray() {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        return array;
    }

    // Function to print an array
    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
