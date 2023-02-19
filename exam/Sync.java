class pyramid {

  synchronized void draw_pyramid(char ch) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(ch);
      }
      System.out.print("\n");
    }
  }
}

class A extends Thread {

  pyramid p;

  A(pyramid p) {
    this.p = p;
  }

  public void run() {
    p.draw_pyramid('*');
  }
}

class B extends Thread {

  pyramid p;

  B(pyramid p) {
    this.p = p;
  }

  public void run() {
    p.draw_pyramid('#');
  }
}

class Sync {

  public static void main(String[] args) {
    pyramid p = new pyramid();
    A thread_A = new A(p);
    B thread_B = new B(p);
    thread_A.start();
    thread_B.start();
  }
}
