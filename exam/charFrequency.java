import java.util.*;

public class charFrequency {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("input the String");
    String st = sc.nextLine();
    System.out.print("input the character");
    char ch = sc.next().charAt(0);
    int frequency = 0;

    for (int i = 0; i < st.length(); i++) {
      if (ch == st.charAt(i)) {
        frequency++;
      }
    }

    System.out.println("frequency :" + frequency);
  }
}
