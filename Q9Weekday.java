import java.util.Scanner;

public class Q9Weekday {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        // Array of weekday names
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Check if the number is within the valid range
        if (number >= 1 && number <= 7) {
            System.out.println(weekdays[number - 1]); // Print the corresponding weekday
        } else {
            System.out.println("Please enter a number between 1 and 7.");
        }

        // Close Scanner
        scanner.close();
    }
}