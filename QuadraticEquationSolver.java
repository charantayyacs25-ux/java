import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        
        if (a == 0) {
            System.out.println("Not a quadratic equation.please enter non 0 value:");
           
  
        }

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        
        double d = b * b - 4 * a * c;

        
        if (d == 0) {
           
            double r1 = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root 1 and Root 2: " + r1);
        } else if (d > 0) {
            
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        } else {
            
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are imaginary.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        System.err.println("name:charantayya");
    }
}

