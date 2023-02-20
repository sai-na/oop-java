import java.util.Scanner;

class FibonacciSeries {

  public static void main(String[] args) {
    int n, t1 = 0, t2 = 1;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the limit for the Fibonacci series: ");
    n = sc.nextInt();

    if (n < 0) {
      System.out.println(
        "Invalid input. The limit must be a positive integer."
      );
      return;
    }

    System.out.print("Fibonacci series up to " + n + " terms: ");

    for (int i = 1; i <= n; i++) {
      System.out.print(t1 + " ");

      int sum = t1 + t2;
      t1 = t2;
      t2 = sum;
    }
  }
}
