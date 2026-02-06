
import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== CALCULATOR ====");
        System.out.println("[0] [1] [2] [3] [4]");
        System.out.println("[5] [6] [7] [8] [9]");
        System.out.println();
        System.out.println("Operators: * / %");
        System.out.println("Enter '=' to get result");
        System.out.println("==========================");

        System.out.print("Enter first number: ");
        double result = sc.nextDouble(); 

        while (true) {
            System.out.print("Enter operator (* / % or =): ");
            char op = sc.next().charAt(0);

            if (op == '=') {
                break; 
            }

            System.out.print("Enter next number: ");
            double num = sc.nextDouble();

            if (op == '*') {
                result= num;
            } else if (op == '/') {
                if (num == 0) {
                    System.out.println("Error: divide by zero!");
                    continue;
                }
                result /= num;
            } else if (op == '%') {
                result %= num;
            } else {
                System.out.println("Invalid operator");
            }
        }

        System.out.println("===================");
        System.out.println("Final Result: " + result);

        sc.close();
    }
}