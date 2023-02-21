class QuickSortStr {

  public static void quickSort(String[] arr, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(arr, low, high); // Partition the array
      quickSort(arr, low, pivotIndex - 1); // Recursively sort the left sub-array
      quickSort(arr, pivotIndex + 1, high); // Recursively sort the right sub-array
    }
  }

  public static int partition(String[] arr, int low, int high) {
    String pivot = arr[high];
    int i = (low - 1); // Index of smaller element
    for (int j = low; j <= high - 1; j++) {
      // If current element is smaller than or equal to pivot
      if (arr[j].compareTo(pivot) <= 0) {
        i++; // Increment index of smaller element
        // Swap arr[i] and arr[j]
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    // Swap arr[i + 1] and arr[high]
    String temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return (i + 1);
  }

  public static void main(String[] args) {
    String[] arr = { "apple", "orange", "banana", "pear", "grape" };
    int n = arr.length;
    quickSort(arr, 0, n - 1);
    System.out.println("Sorted array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
