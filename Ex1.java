
public class Ex1 {

  public static void main(String args[]) {
    // TODO code application logic here
    Employee emp1 = new Employee("Chan Tai Man", 12000);
    Employee emp2 = new Employee("Tam Ping Shing", 13500);
    int oldSalary;

    //**** 3
    System.out.println("Before-");
    System.out.println("Employee 1: name=" + emp1.getName()
            + " salary=" + emp1.getSalary());
    System.out.println("Employee 2: name=" + emp2.getName()
            + " salary=" + emp2.getSalary());

    //**** 4
    oldSalary = emp1.getSalary();
    emp1.setSalary((int) (oldSalary * 1.1));

    oldSalary = emp2.getSalary();
    emp2.setSalary((int) (oldSalary * 1.05));

    //**** 5
    System.out.println("After-");
    System.out.println("Employee 1: name=" + emp1.getName()
            + " salary=" + emp1.getSalary());
    System.out.println("Employee 2: name=" + emp2.getName()
            + " salary=" + emp2.getSalary());
  }
}

