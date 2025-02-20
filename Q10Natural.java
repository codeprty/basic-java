public class Q10Natural {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;

        System.out.println("The first n natural numbers are: " + n);

        // Print numbers in a single loop
        StringBuilder numbers = new StringBuilder();
        StringBuilder sumExpression = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            numbers.append(i);
            sumExpression.append(i);
            sum += i;
            if (i < n) {
                numbers.append(", ");
                sumExpression.append(" + ");
            }
        }

        System.out.println(numbers);
        System.out.println(sumExpression + " = " + sum);
        System.out.println("Sum of first n natural numbers are: " + sum);
    }
}