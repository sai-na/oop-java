import java.util.*;

class StringTokenizerDemo {

  public static void main(String[] args) {
    int n;
    int sum = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the intergers with space");

    String s = sc.nextLine();

    StringTokenizer st = new StringTokenizer(s, " ");
    while (st.hasMoreTokens()) {
      String temp = st.nextToken();
      n = Integer.parseInt(temp);
      System.out.println(n);
      sum += n;
    }

    System.out.println("sum : " + sum);
  }
}
