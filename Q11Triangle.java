import java.util.Scanner;

public class Q11Triangle {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        int num = 1;

        // Generate the right-angle triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // Close Scanner
        scanner.close();
    }
}