package Calculator;
import java.util.*;
public class Testcal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println("Enter operator");
        char op = sc.next().charAt(0);
      //  char op2 = sc.next().charAt(0);
        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();
        Modulus r = new Modulus();
        Trignofun t = new Trignofun();
        double result;
        switch (op) {
            case '+':
                System.out.println("Addition of numbers is:" + a.add(n,n2));
                break;
            case '-':
                System.out.println("Subtraction of numbers is:" + s.sub(n,n2));
                break;

            case '*':
                System.out.println("Multiplication of numbers is:" + m.mul(n,n2));
                break;

            case '/':
                System.out.println("division of numbers is:" + d.div(n,n2));
                break;
            case '%':
                System.out.println("Modulus of numbers is:" + r.mod(n,n2));
                break;
            case's':
                System.out.println("Sin value is:"+t.sin());
                System.out.println("Sin value is:"+t.cos());
                System.out.println("Sin value is:"+t.tan());
                System.out.println("Sin value is:"+t.cot());
        }
    }
}


