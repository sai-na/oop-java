import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileHandling {

  //throws IOException
  public static void main(String agrs[]) {
    try {
      FileInputStream fi = new FileInputStream("input.txt");

      File file = new File("output.txt");
      file.createNewFile();
      //  String absolutePath = name . getAbsolutePath();

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
