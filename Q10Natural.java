public class Q10Natural {
    public static void main(String[] args) {
        // Parse the input argument to an integer
        int n = Integer.parseInt(args[0]);
        int sum = 0;

        // Print the input value
        System.out.println("The first n natural numbers are: " + n);

        // Use StringBuilder to store number sequence and sum expression
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

        // Print the number sequence, sum expression, and final sum result
        System.out.println(numbers);
        System.out.println(sumExpression + " = " + sum);
        System.out.println("Sum of first n natural numbers are: " + sum);
    }
}