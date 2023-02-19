abstract class Shape {

  abstract void noOfSides();
}

class triangle extends Shape {

  void noOfSides() {
    System.out.println("triangle -3");
  }
}

class reactangle extends Shape {

  void noOfSides() {
    System.out.println("reactangle -4");
  }
}

class pentegon extends Shape {

  void noOfSides() {
    System.out.println("pentegon -5");
  }
}

class hexagon extends Shape {

  void noOfSides() {
    System.out.println("hexagon -6");
  }
}

class polymorphism {

  public static void main(String args[]) {
    triangle tri = new triangle();
    reactangle rea = new reactangle();
    pentegon pen = new pentegon();
    hexagon hex = new hexagon();

    tri.noOfSides();
    rea.noOfSides();
    pen.noOfSides();
    hex.noOfSides();
  }
}
