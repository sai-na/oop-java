import java.io.*;
import java.util.*;

class FileHandling {

  public static void main(String agrs[]) throws IOException {
    try {
      FileInputStream fi = new FileInputStream("input.txt");
      FileOutputStream fo = new FileOutputStream("output.txt");
      int i = 0;
      while ((i = fi.read()) != -1) {
        fo.write(i);
      }

      fi.close();
      fo.close();
    } catch (IOException e) {
      System.out.println("Exception found" + e);
    }
  }
}
