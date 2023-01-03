class pyramid {

  synchronized void draw_pyramid(char ch) {
    for (int i = 0; i < 10; i += 2) {
      for (int k = 10 - i; k > 0; k -= 2) {
        System.out.println(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(ch);
      }
    }
    System.out.println(" ");
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

class ThreadSync {

  public static void main(String[] args) {
    pyramid obj = new pyramid();
    A thread_A = new A(obj);
    B thread_B = new B(obj);
    thread_A.start();
    thread_B.start();
  }
}
