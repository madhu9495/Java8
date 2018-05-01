import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass {
  public static void main(String[] a) {
    ArrayList<Employee> emps = new ArrayList<Employee>();
    emps.add(new Employee(101,"Ram",25000,"HYD"));
    emps.add(new Employee(102,"Surya",30000,"VIZ"));
    emps.add(new Employee(103,"Siva",32000,"HYD"));

   Consumer<Employee> emp = (Employee e) -> System.out.println("ID:"+e.id +" and Name:"+e.name +" and salary:"+e.salary +" and Address:"+e.address);
   
   emps.forEach(emp);

  }
}

class Employee {
  public int id;

  public String name;

  public int salary;
  
  public String address;


  public Employee(int id, String name, int salary, String address) {
    this.id=id;
    
    this.name = name;
    
    this.salary = salary;
    
    this.address = address;

  }

  public String getName() {
    return this.name;
  }

  public void setName(String lastName) {
    this.name = name;
  }


  public int getSalary() {
    return this.salary;
  }
  
  public void setSalary(int salary) {
    this.name = name;
  }
}
