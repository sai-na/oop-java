import java.util.Scanner;

public class String_QuickSort {

  String names[];
  int length;

  public static void main(String[] args) {
    Scanner scl = new Scanner(System.in);
    String_QuickSort sorts = new String_QuickSort();
    System.out.println("Enter the number of list elements");
    int n = scl.nextInt();
    String[] words = new String[n];
    System.out.print("Enter the list elements \n");
    for (int i = 0; i < n; i++) {
      words[i] = scl.next();
    }
    sorts.sort(words);
    System.out.println("The sorted list ");
    for (String i : words) {
      System.out.print(i);
      System.out.print("\t");
    }
  }

  void sort(String array[]) {
    if (array == null || array.length == 0) {
      return;
    }
    this.names = array;
    this.length = array.length;
    quickSort(0, length - 1);
  }

  void quickSort(int low, int high) {
    int i = low;
    int j = high;
    String pivot = this.names[low + (high - low) / 2];
    while (i <= j) {
      while (this.names[i].compareToIgnoreCase(pivot) < 0) {
        i++;
      }
      while (this.names[j].compareToIgnoreCase(pivot) > 0) {
        j--;
      }
      if (i <= j) {
        swap(i, j);
        j--;
      }
    }
    if (low < j) {
      quickSort(low, j);
    }
    if (i < high) {
      quickSort(i, high);
    }
  }

  void swap(int i, int j) {
    String temp = this.names[i];
    this.names[i] = this.names[j];
    this.names[j] = temp;
  }
}
