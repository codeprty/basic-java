import java.util.Scanner;

public class Q12Triangle {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        // Generate the inverted triangle pattern
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < (rows - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Close Scanner
        scanner.close();
    }
}