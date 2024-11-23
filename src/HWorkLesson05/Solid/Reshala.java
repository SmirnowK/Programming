package HWorkLesson05.Solid;

import java.util.Scanner;

public class Reshala {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter operation: +, -, * or / ²");
        char op;
        op = input.next().charAt(0);
        Operation operation = new Operation();
        switch (op) {

            case '+':
                double a = operation.operation("Please enter first number: ");
                double b = operation.operation("Please enter first number: ");
                double result = a + b;
                System.out.println("Result: " + result);
                break;

            case '-':
                double q = operation.operation("Please enter first number: ");
                double w = operation.operation("Please enter first number: ");
                double resultm = q - w;
                System.out.println("Result: " + resultm);
                break;

            case '*':
                double q1 = operation.operation("Please enter first number: ");
                double w1 = operation.operation("Please enter first number: ");
                double resultu = q1 * w1;
                System.out.println("Result: " + resultu);
                break;

            case '/':
                double a1 = operation.operation("Please enter first number: ");
                double b1 = operation.operation("Please enter first number: ");
                double resuld = a1 / b1;
                System.out.println("Result: " + resuld);
                break;

            case '²':
                double a2 = operation.operation("Please enter first number: ");
                double b2 = operation.operation("Please enter first number: ");
                double resul2 = a2 * b2;
                System.out.println("Result: " + resul2);
                break;

            default:
                System.out.println("You entered an invalid operation.");
        }
    }
}


