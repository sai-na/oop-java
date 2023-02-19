import java.util.*;

class emp {

  int id;
  String address;
  long phone;
  String name;
  int salary;

  void getSalary() {
    System.out.println("Salary" + salary);
  }
}

class officer extends emp {

  String specification;
}

class manager extends emp {

  String department;
}

class inheritance {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    emp e = new emp();
    officer o = new officer();
    manager m = new manager();
    System.out.println(
      "Enter the employee name , id , address , phone , salary"
    );
    e.name = sc.next();
    e.id = sc.nextInt();
    e.address = sc.next();
    e.phone = sc.nextLong();
    e.salary = sc.nextInt();

    System.out.println(
      "Enter the officer name , id , address , phone , salary,specification"
    );
    o.name = sc.next();
    o.id = sc.nextInt();
    o.address = sc.next();
    e.phone = sc.nextLong();
    o.salary = sc.nextInt();
    o.specification = sc.next();

    System.out.println(
      "Enter the manager name , id , address , phone , salary,department"
    );
    m.name = sc.next();
    m.id = sc.nextInt();
    m.address = sc.next();
    e.phone = sc.nextLong();
    m.salary = sc.nextInt();
    m.department = sc.next();

    System.out.println("empolyee");
    System.out.println(e.name + e.id + e.address + e.phone + e.salary);

    System.out.println("officer");
    System.out.println(
      o.name + o.id + o.address + o.salary + e.phone + o.specification
    );

    System.out.println("manager");
    System.out.println(
      m.name + m.id + m.address + m.salary + e.phone + m.department
    );
  }
}
