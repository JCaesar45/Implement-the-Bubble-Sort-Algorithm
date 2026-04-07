def bubble_sort(array):
    """
    Sorts an array using the bubble sort algorithm.
    
    Args:
        array: A list of integers to be sorted
    
    Returns:
        A new list with integers sorted from least to greatest
    """
    # Create a copy to avoid mutating the original array
    arr = list(array)
    n = len(arr)
    
    # Outer loop for each pass through the array
    for i in range(n):
        # Flag to track if any swaps occurred in this pass
        swapped = False
        
        # Inner loop for comparing adjacent elements
        # We subtract i because the last i elements are already sorted
        for j in range(n - 1 - i):
            # Compare adjacent elements
            if arr[j] > arr[j + 1]:
                # Swap if they're in the wrong order
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        
        # If no swaps occurred, the array is already sorted
        if not swapped:
            break
    
    return arr


# Test cases
if __name__ == "__main__":
    test_array = [1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92]
    print(bubble_sort(test_array))
    # Expected: [1, 1, 2, 2, 4, 8, 32, 43, 43, 55, 63, 92, 123, 123, 234, 345, 5643]
    
    print(bubble_sort([5, 3, 8, 1, 2]))  # [1, 2, 3, 5, 8]
    print(bubble_sort([]))  # []
    print(bubble_sort([1]))  # [1]
    print(bubble_sort([3, 2, 1]))  # [1, 2, 3]
