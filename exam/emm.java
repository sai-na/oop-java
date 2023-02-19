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

public class emm {

  public static void main(String[] args) {
    Employee emp = new Employee();
    Manager mgr = new Manager();

    emp.id = 23;
    emp.name = "arun";
    emp.setSalary(23456.60);

    mgr.id = 45;
    mgr.name = "rte";
    mgr.setSalary(2345632.60);
    mgr.specification = "manager";

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
