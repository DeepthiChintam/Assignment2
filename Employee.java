package Emp;
import java.util.ArrayList;
    public class Employee {
        ArrayList<Employee> emp=new ArrayList<>();
        String firstname;
        String lastname;
        int age;
        int salary;
        public  Employee(String firstname,String lastname,int age,int salary)
        {
            this.firstname=firstname;
            this.lastname=lastname;
            this.age=age;
            this.salary=salary;
        }
    }

