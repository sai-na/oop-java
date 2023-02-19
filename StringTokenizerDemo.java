import java.util.*;

public class StringTokenizerDemo {

  public static void main(String[] args) {
    int sum = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter digits with a Space Gap : ");
    String str = scan.nextLine();
    StringTokenizer st = new StringTokenizer(str, " ");
    while (st.hasMoreTokens()) {
      String temp = st.nextToken();
      int n = Integer.parseInt(temp);
      System.out.println(n);
      sum = sum + n;
    }
    System.out.println(sum);
  }
}
