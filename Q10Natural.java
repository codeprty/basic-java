import java.util.Scanner;

public class Q10Natural {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Input number: ");
        int n = scanner.nextInt();

        int sum = 0;
        StringBuilder numbers = new StringBuilder();
        StringBuilder sumExpression = new StringBuilder();

        // Loop through natural numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            numbers.append(i);
            sumExpression.append(i);
            sum += i;
            if (i < n) {
                numbers.append(", ");
                sumExpression.append(" + ");
            }
        }

        // Print the number sequence and sum calculation
        System.out.println("The first n natural numbers are: " + n);
        System.out.println(numbers);
        System.out.println(sumExpression + " = " + sum);
        System.out.println("Sum of first n natural numbers are: " + sum);

        // Close Scanner
        scanner.close();
    }
}