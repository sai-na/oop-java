import java.util.*;

class palindrome {

  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a word");
    String original = in.nextLine();
    original = original.toLowerCase();

    String reverse = "";
    int length = original.length();

    for (int i = length - 1; i >= 0; i--) { // charAt(0)= first element
      reverse += original.charAt(i);
    }

    // System.out.println(reverse);
    if (reverse.equals(original)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}
// exe cmds
// gedit palindrome.java
// javac palindrome.java
// java palindrome        //         ( java class name )
