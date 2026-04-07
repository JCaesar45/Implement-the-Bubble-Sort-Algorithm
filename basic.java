public class BubbleSort {
    
    /**
     * Sorts an array using the bubble sort algorithm.
     * 
     * @param array An array of integers to be sorted
     * @return A new array with integers sorted from least to greatest
     */
    public static int[] bubbleSort(int[] array) {
        // Create a copy to avoid mutating the original array
        int[] arr = array.clone();
        int n = arr.length;
        
        // Outer loop for each pass through the array
        for (int i = 0; i < n; i++) {
            // Flag to track if any swaps occurred in this pass
            boolean swapped = false;
            
            // Inner loop for comparing adjacent elements
            // We subtract i because the last i elements are already sorted
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if they're in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        
        return arr;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        int[] testArray = {1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92};
        int[] sorted = bubbleSort(testArray);
        
        // Print result
        System.out.print("[");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i]);
            if (i < sorted.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // Expected: [1, 1, 2, 2, 4, 8, 32, 43, 43, 55, 63, 92, 123, 123, 234, 345, 5643]
        
        // Additional test cases
        printArray(bubbleSort(new int[]{5, 3, 8, 1, 2}));  // [1, 2, 3, 5, 8]
        printArray(bubbleSort(new int[]{}));  // []
        printArray(bubbleSort(new int[]{1}));  // [1]
        printArray(bubbleSort(new int[]{3, 2, 1}));  // [1, 2, 3]
    }
    
    // Helper method to print arrays
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
