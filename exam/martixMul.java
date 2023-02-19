import java.util.*;

public class martixMul {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("row of 1st matrix");
    int row1 = sc.nextInt();

    System.out.println("columns of 1st matrix");

    int column1 = sc.nextInt();

    System.out.println("row of 2nd matrix");
    int row2 = sc.nextInt();

    System.out.println("row of 2nd matrix");
    int column2 = sc.nextInt();

    if (column1 != row2) {
      System.out.println("multiplication not possible");
      return;
    }

    int a[][] = new int[row1][column1];
    int b[][] = new int[row2][column2];
    int c[][] = new int[row2][column1];

    System.out.println("input 1st matrix ");
    for (int i = 0; i < row1; i++) {
      int ip = i + 1;
      for (int j = 0; j < column1; j++) {
        int jp = i + 1;
        System.out.println("row " + ip + ", column " + jp);
        a[i][j] = sc.nextInt();
      }
    }

    System.out.println("input 2st matrix ");
    for (int i = 0; i < row2; i++) {
      int ip = i + 1;
      for (int j = 0; j < column2; j++) {
        int jp = i + 1;
        System.out.println("row " + ip + ", column " + jp);
        b[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < column2; j++) {
        c[i][j] = 0;
        for (int k = 0; k < column1; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
      }
    }

    System.out.println("result \n");

    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < column2; j++) {
        System.out.print(c[i][j] + "   ");
      }
      System.out.print("\n");
    }
  }
}
