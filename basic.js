function bubbleSort(array) {
  // Create a copy to avoid mutating the original array
  const arr = [...array];
  const n = arr.length;
  
  // Outer loop for each pass through the array
  for (let i = 0; i < n; i++) {
    // Flag to track if any swaps occurred in this pass
    let swapped = false;
    
    // Inner loop for comparing adjacent elements
    // We subtract i because the last i elements are already sorted
    for (let j = 0; j < n - 1 - i; j++) {
      // Compare adjacent elements
      if (arr[j] > arr[j + 1]) {
        // Swap if they're in the wrong order
        const temp = arr[j];
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

// Test cases
console.log(bubbleSort([1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92]));
// Expected: [1, 1, 2, 2, 4, 8, 32, 43, 43, 55, 63, 92, 123, 123, 234, 345, 5643]

// Additional test cases
console.log(bubbleSort([5, 3, 8, 1, 2])); // [1, 2, 3, 5, 8]
console.log(bubbleSort([])); // []
console.log(bubbleSort([1])); // [1]
console.log(bubbleSort([3, 2, 1])); // [1, 2, 3]
