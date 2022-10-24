import java.util.*;

class frequency {

  public static void main(String[] args) {
    String str = "";
    int freq = 0;

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the word");

    str = in.nextLine();
    str.toLowerCase();
    System.out.println("Enter the character");

    char character = in.next().charAt(0);

    //String ch = in.nextLine();
    //char character = ch.charAt(0);

    character.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == character) {
        freq++;
      }
    }

    System.out.println("The frequency of " + character + " is " + freq);
  }
}
