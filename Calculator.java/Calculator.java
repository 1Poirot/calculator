
import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       

        System.out.println("==== CALCULATOR ====");
        System.out.println("[0] [1] [2] [3] [4]");
        System.out.println("[5] [6] [7] [8] [9]");
        System.out.println();
        System.out.println("Operators: + -");
        System.out.println("Enter '=' to get result");
        System.out.println("===================");

        System.out.print("Enter first number: ");
        double result = sc.nextDouble(); 

     while (true) {
        while (true) {
            System.out.print("Enter operator (+ - or =): ");
            String op = sc.next();

            if (op.equals("=")) {
                System.out.println("Result: " + result);
                sc.close();
                return;
            }

            System.out.print("Enter next number: ");
            double num = sc.nextDouble();

            if (op.equals("+")) {
                result += num;
            } else if (op.equals("-")) {
                result -= num;
            } else {
                System.out.println("Invalid operator. Please use +, -, or =.");
            }
        }
     }

    }
}
