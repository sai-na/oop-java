import java.util.*;

class metrixMul {

  public static void main(String args[]) {
    int a, b, c, d;

    Scanner sn = new Scanner(System.in);

    System.out.println("row 1");
    a = sn.nextInt();
    System.out.println("col 1");
    b = sn.nextInt();
    System.out.println("row 2");
    c = sn.nextInt();
    System.out.println("col 2");
    d = sn.nextInt();

    if (b != c) {
      System.out.println("Multiplication is not posible ");
    } else {
      int m1[][] = new int[a][b]; // m1(axb)
      int m2[][] = new int[b][d]; //m2(bxd)
      int m3[][] = new int[10][10]; //m3(aXd) // if b are same

      System.out.println("input data into first matrix ");
      for (int row = 0; row < a; row++) {
        for (int column = 0; column < b; column++) {
          System.out.print(
            "input data into m1[" + row + "]" + "[" + column + "]"
          );
          m1[row][column] = sn.nextInt();
        }
      }

      System.out.println("input data into Second matrix ");
      for (int i = 0; i < b; i++) {
        for (int j = 0; j < d; j++) {
          System.out.print("input data into m2[" + i + "]" + "[" + j + "]");
          m2[i][j] = sn.nextInt();
        }
      }

      for (int i = 0; i < a; i++) {
        for (int j = 0; j < d; j++) {
          for (int k = 0; k < b; k++) {
            m3[i][j] += m1[i][k] * m2[k][j];
          }
        }
      }

      System.out.println("Resultant matrix ");
      for (int i = 0; i < a; i++) {
        for (int j = 0; j < d; j++) {
          System.out.print(m3[i][j] + "  ");
        }
        System.out.println("");
      }
    } // end  else
  } // end main
} // end class
