public class Q7Sum {
    public static void main(String[] args) {
        // Parse the input arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Ensure a is the smaller number and b is the larger number
        if (a > b) {
            int c = b;
            b = a;
            a = c;
        }

        // Declare and initialize a variable to store the sum
        int sum = 0;

        // Loop to calculate the sum of all consecutive numbers from a to b
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        // Print the final sum
        System.out.println(sum);
    }
}