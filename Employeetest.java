package Emp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Employeetest
{
    public  static void main(String args[]) {

    Employee e = new Employee("Vijay", "Chintam", 50, 200000);
    Employee e1 = new Employee("Deepthi", "Balla", 26, 300000);
    Employee e2 = new Employee("Vamsi", "balla", 34, 500000);
    Employee e3 = new Employee("Sarayu", "Chint", 10, 600000);
    Employee e4 = new Employee("Sravani", "Madiraju", 22, 250000);
    ArrayList<Employee> emp = new ArrayList<>();
    emp.add(e);
    emp.add(e1);
    emp.add(e2);
    emp.add(e3);
    emp.add(e4);
     Employeetest t=new Employeetest();
    Scanner sc = new Scanner(System.in);
    String lastname = sc.nextLine();
    System.out.println("Enter Employee lastname");
    t.empdetailsbylastname(emp,lastname);
    t.maxsalary(emp);
    t.averagage(emp);



}

    public void averagage(ArrayList<Employee> emp) {
    }

    public void employeedetails(ArrayList<Employee> emp){
        for(Employee e:emp){
            System.out.println(e.firstname + " " + e.lastname + " " + e.age + " " +e.salary);
        }

    }
    public void empdetailsbylastname(ArrayList<Employee> emp,String lastname){
        for(Employee f:emp){
            if((f.lastname).equals(lastname)){
                System.out.println("Details of Employee: "+f.firstname+" "+f.lastname+" "+f.age+" "+f.salary);
            }

        }
    }
    public void maxsalary(ArrayList<Employee> emp){
        int max=0;
        for(Employee g:emp) {
            if (g.salary > max) {
                max = g.salary;
            }
        }


}
}
