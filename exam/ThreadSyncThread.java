class Displayp {

  public synchronized void print(String str) {
    System.out.println(str);
    try {
      Thread.sleep(1000);
    } catch (Exception e) {}

    System.out.println("end");
  }
}

class A extends Thread {

  Displayp p;

  A(Displayp p) {
    this.p = p;
  }

  public void run() {
    p.print("hi");
  }
}

class B extends Thread {

  Displayp p;

  B(Displayp p) {
    this.p = p;
  }

  public void run() {
    p.print("ho");
  }
}

public class ThreadSyncThread {

  public static void main(String args[]) {
    Displayp p = new Displayp();
    A aobj = new A(p);
    B bobj = new B(p);

    bobj.start();
    aobj.start();
  }
}
