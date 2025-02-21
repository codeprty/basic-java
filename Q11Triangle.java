public class Q11Triangle {
    public static void main(String[] args) {
        // Parse the input argument to an integer
        int rows = Integer.parseInt(args[0]);

        int num = 1;

        // Loop through rows
        for (int i = 1; i <= rows; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}