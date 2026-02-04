import java.util.Scanner;

public class featureA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== CALCULATOR ====");
        System.out.println("[0] [1] [2] [3] [4]");
        System.out.println("[5] [6] [7] [8] [9]");
        System.out.println();
        System.out.println("Operators: +  -");
        System.out.println("Press = to calculate");
        System.out.println("====================");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+ or -): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else {
            System.out.println("Invalid operator");
            sc.close();
            return;
        }

        System.out.println();
        System.out.println("Process:");
        System.out.println(num1 + " " + op + " " + num2);

        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}