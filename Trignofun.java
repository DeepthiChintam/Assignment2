package Calculator;
import java.math.*;
import java.util.Scanner;

public class Trignofun {

Scanner sc =new Scanner(System.in);

    public double sin() {
        System.out.println("Enter degree");
        double sin = Math.toRadians(Math.sin(sc.nextDouble()));
        return sin;
    }

    public double cos() {
        System.out.println("Enter degree");
        double  cos= Math.toRadians(Math.cos(sc.nextDouble()));
        return cos;
    }

    public double tan() {
        System.out.println("Enter degree");
        double tan= Math.toRadians(Math.tan(sc.nextDouble()));
        return tan;
    }

    public double cot() {
        System.out.println("Enter degree");
        double cot =  Math.toRadians(Math.cos(sc.nextDouble()))/(Math.sin(sc.nextDouble()));
        return cot;
    }
}

