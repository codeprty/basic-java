import java.util.Scanner;

public class Q18Calculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an operator
        System.out.print("Choose an operator: +, -, *, or /: ");
        char operator = scanner.next().charAt(0);

        // Prompt user to enter the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user to enter the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform the calculation based on the chosen operator
        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        // Close scanner
        scanner.close();
    }
}