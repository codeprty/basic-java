public class Q8Number {
    public static void main(String[] args) {
        // Parse the argument to an integer
        int number = Integer.parseInt(args[0]);

        // Check if the number is positive or negative
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }
}