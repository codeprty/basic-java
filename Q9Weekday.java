public class Q9Weekday {
    public static void main(String[] args) {
        // Parse the argument to an integer
        int number = Integer.parseInt(args[0]);

        // Determine the corresponding weekday and print the result
        switch(number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a number between 1 and 7.");
                break;
        }
    }
}