/*   Write a java program which creates a class named employee and have following member name, date, phone number, address, salary .
It also has a method to print salary which prints the salary which prints the salary of employee.
2 classes offices and manager have data members specialization and department.
Now assign name , age, Phone number, address and salary to an officer and a manager .
by making an object of both of this classes and print the same.*/

import java.util.*;

class Employee {

  int id;
  String name;
  String dob;
  String phonnum;
  String address;
  double salary;

  void printsalary() {
    System.out.println(name + " " + salary);
  }
}

class officer extends Employee {

  String department;
  String specialization;

  void printall() {
    System.out.println(
      "\nID : " +
      id +
      "\nName : " +
      name +
      "\nDOB : " +
      dob +
      "\nPhone Number : " +
      phonnum +
      "\nAddress : " +
      address +
      "\nSalary : " +
      salary +
      "\nSpecialization : " +
      specialization +
      "\nDepartment : " +
      department
    );
  }
}

class manager extends Employee {

  String department;
  String specialization;

  void printall() {
    System.out.println(
      "\nID : " +
      id +
      "\nName : " +
      name +
      "\nDOB : " +
      dob +
      "\nPhone Number : " +
      phonnum +
      "\nAddress : " +
      address +
      "\nSalary : " +
      salary +
      "\nSpecialization : " +
      specialization +
      "\nDepartment : " +
      department
    );
  }
}

class employee {

  public static void main(String[] args) {
    officer o = new officer();

    Scanner sn = new Scanner(System.in);

    Scanner snint = new Scanner(System.in);

    Scanner sndou = new Scanner(System.in);

    System.out.println("officer id");
    o.id = snint.nextInt();

    System.out.println("officer name");
    o.name = sn.nextLine();

    System.out.println("officer dob");
    o.dob = sn.nextLine();

    System.out.println("officer mobile");
    o.phonnum = sn.nextLine();

    System.out.println("officer salary");
    o.salary = sndou.nextDouble();

    System.out.println("officer address");
    o.address = sn.nextLine();

    System.out.println("officer specialization");
    o.specialization = sn.nextLine();

    System.out.println("officer department");
    o.department = sn.nextLine();

    manager b = new manager();

    System.out.println("manager id");
    b.id = snint.nextInt();

    System.out.println("manager name");
    b.name = sn.nextLine();

    System.out.println("manager dob");
    b.dob = sn.nextLine();

    System.out.println("manager mobile");
    b.phonnum = sn.nextLine();

    System.out.println("manager salary");
    b.salary = sndou.nextDouble();

    System.out.println("manager address");
    b.address = sn.nextLine();

    System.out.println("manager specialization");
    b.specialization = sn.nextLine();

    System.out.println("manager department");
    b.department = sn.nextLine();

    o.printall();

    o.printsalary();

    b.printsalary();

    b.printall();
  }
}
