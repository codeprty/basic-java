public class Q12Triangle {
    public static void main(String[] args) {
        // Parse the input argument to an integer
        int rows = Integer.parseInt(args[0]);

        // Loop through each row
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
    }
}