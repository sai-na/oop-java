abstract class Shape {

  abstract void noOfSides();
}

class Triangle extends Shape {

  void noOfSides() {
    System.out.println("3 sides");
  }
}

class Rectangle extends Shape {

  void noOfSides() {
    System.out.println("4 sides");
  }
}

class Pentagon extends Shape {

  void noOfSides() {
    System.out.println("5 sides");
  }
}

class Hexagon extends Shape {

  void noOfSides() {
    System.out.println("6 sides");
  }
}

class AbstractExample {

  public static void main(String[] args) {
    Triangle tri = new Triangle();
    tri.noOfSides();

    Rectangle re = new Rectangle();
    re.noOfSides();

    Pentagon pt = new Pentagon();
    pt.noOfSides();

    Hexagon he = new Hexagon();
    he.noOfSides();
  }
}
