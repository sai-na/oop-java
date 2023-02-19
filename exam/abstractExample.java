abstract class Shape {

  abstract void noOfSides();
}

class triangle extends Shape {

  void noOfSides() {
    System.out.println("3 sides");
  }
}

class rectangle extends Shape {

  void noOfSides() {
    System.out.println("4 sides");
  }
}

class pentagon extends Shape {

  void noOfSides() {
    System.out.println("5` sides");
  }
}

class hexagon extends Shape {

  void noOfSides() {
    System.out.println("6 sides");
  }
}

class abstractExample {

  public static void main(String[] args) {
    triangle tri = new triangle();
    tri.noOfSides();

    rectangle re = new rectangle();
    re.noOfSides();

    pentagon pt = new pentagon();
    pt.noOfSides();

    hexagon he = new hexagon();
    he.noOfSides();
  }
}
