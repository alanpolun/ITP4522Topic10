
public class Ex1 {

  public static void main(String args[]) {
    Employee emp1 = new Employee("Chan Tai Man", 12000);
    Employee emp2 = new Employee("Tam Ping Shing", 13500);

    //**** 3
    System.out.println("Before-");
    System.out.println("Employee 1: name=" + emp1.getName()
            + " salary=" + emp1.getSalary());
    System.out.println("Employee 2: name=" + emp2.getName()
            + " salary=" + emp2.getSalary());

    //**** 4
    emp1.setSalary((int) (emp1.getSalary() * 1.1));
    emp2.setSalary((int) (emp2.getSalary() * 1.05));

    //**** 5
    System.out.println("After-");
    System.out.println("Employee 1: name=" + emp1.getName()
            + " salary=" + emp1.getSalary());
    System.out.println("Employee 2: name=" + emp2.getName()
            + " salary=" + emp2.getSalary());
  }
}

