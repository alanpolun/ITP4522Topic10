
public class Ex1 {

  public static void main(String args[]) {
    // TODO code application logic here
    Employee emp1 = new Employee();
    Employee emp2 = new Employee();
    int oldSalary;

    //**** 1
    emp1.setName("Chan Tai Man");
    emp1.setSalary(12000);

    //**** 2
    emp2.setName("Tam Ping Shing");
    emp2.setSalary(13500);

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

