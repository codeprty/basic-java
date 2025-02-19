public class Q5Range {  
    public static void main(String args[]) {  
        // Parse the input argument to an integer
        int x = Integer.parseInt(args[0]);

        // Check if x is between 0 and 50 or between 80 and 100
        if ((x >= 0 && x <= 50) || (x >= 80 && x <= 100)) {
            // Print the result using type casting with String.valueOf(x)
            System.out.println(String.valueOf(x) + " is between 0 and 50 or 80 and 100.");
        }
    }
}