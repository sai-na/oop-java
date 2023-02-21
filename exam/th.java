import java.math.*;
import java.util.*;

class Dis {

  synchronized void print(int n) {
    if (n % 2 == 0) {
      int sq = n * n;

      System.out.println(sq);
    } else {
      int cu = n * n * n;
      System.out.println(cu);
    }
    try {
      Thread.sleep(1000);
    } catch (Exception e) {} finally {
      System.out.println("done");
    }
  }
}

class A extends Thread {

  Dis p;
  int n;

  A(Dis p, int n) {
    this.p = p;
    this.n = n;
  }

  public void run() {
    p.print(n);
  }
}

class B extends Thread {

  Dis p;
  int n;

  B(Dis p, int n) {
    this.p = p;
    this.n = n;
  }

  public void run() {
    p.print(n);
  }
}

class th {

  public static void main(String args[]) {
    int n = (int) (Math.random() * 100);

    Dis obj = new Dis();
    A obja = new A(obj, n);
    B objb = new B(obj, n);
    if (n % 2 == 0) {
      obja.start();
    } else {
      objb.start();
    }
  }
}
