import java.util.Scanner;

class Employee {

  int id;
  String name;
  double salary;

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}

class Manager extends Employee {

  String specification;
}

class inheritance {

  public static void main(String[] args) {
    Employee emp = new Employee();
    Manager mgr = new Manager();

    Scanner sc = new Scanner(System.in);
    Scanner sl = new Scanner(System.in);
    Scanner sj = new Scanner(System.in);

    System.out.print("input emp id ");
    emp.id = sj.nextInt();
    System.out.print("input emp name ");
    emp.name = sl.nextLine();

    System.out.print("input emp salary ");
    emp.setSalary(sc.nextDouble());

    System.out.print("input mgr id ");
    mgr.id = sj.nextInt();

    System.out.print("input mgr name ");
    mgr.name = sl.nextLine();

    System.out.print("input mgr salary ");
    mgr.setSalary(sc.nextDouble());

    System.out.print("input mgr specification ");
    mgr.specification = sl.nextLine();

    // emp.id = 23;
    // emp.name = "arun";
    // emp.setSalary(23456.60);

    // mgr.id = 45;
    // mgr.name = "rte";
    // mgr.setSalary(2345632.60);
    // mgr.specification = "manager";

    System.out.println(
      emp.id +
      " " +
      emp.name +
      " " +
      emp.getSalary() +
      " " +
      mgr.id +
      " " +
      mgr.name +
      " " +
      mgr.getSalary() +
      " " +
      mgr.specification
    );
  }
}
