public class QuickSort {

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(arr, low, high); // Partition the array
      quickSort(arr, low, pivotIndex - 1); // Recursively sort the left sub-array
      quickSort(arr, pivotIndex + 1, high); // Recursively sort the right sub-array
    }
  }

  public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1); // Index of smaller element
    for (int j = low; j <= high - 1; j++) {
      // If current element is smaller than or equal to pivot
      if (arr[j] <= pivot) {
        i++; // Increment index of smaller element
        // Swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    // Swap arr[i + 1] and arr[high]
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return (i + 1);
  }

  public static void main(String[] args) {
    int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
    int n = arr.length;
    quickSort(arr, 0, n - 1);
    System.out.println("Sorted array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
