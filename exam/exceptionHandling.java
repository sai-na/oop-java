public class exceptionHandling {

  static void division() throws ArithmeticException {
    int a = 4, b = 3, c = 5;
    int z = a / (2 * b - c);
    System.out.println(z);
  }

  public static void main(String[] args) {
    division();

    try {
      int arr[] = { 0, 0, 0 };

      int d = arr[4];

      System.out.println(d);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("exception caught" + " Index 4 out of bounds");
    } finally {
      System.out.println("done");
    }
  }
}
