import java.util.Scanner;

public class Q13Equal {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();

        // Check if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println(num1 + " not equal " + num2 + " not equal " + num3);
            System.out.println("Numbers are not equal.");
        }

        // Close Scanner
        scanner.close();
    }
}