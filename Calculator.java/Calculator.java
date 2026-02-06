import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double total = sc.nextDouble();

        while (true) {
            System.out.print("Enter operator (+ - or =): ");
            String operator = sc.next();

            
            if (operator.equals("=")) {
                break;
            }

            System.out.print("Enter next number: ");
            double nextNum = sc.nextDouble();

            
            if (operator.equals("+")) {
                total += nextNum;
            } else if (operator.equals("-")) {
                total -= nextNum;
            } else {
                System.out.println("Invalid operator!");
            }
        }

        System.out.println("====================");
        System.out.println("Final Result: " + total);
        
        sc.close();
    }
}