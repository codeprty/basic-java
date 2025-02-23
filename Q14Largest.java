import java.util.Arrays;

public class Q14Largest {
    public static void main(String[] args) {
        // Given array
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 3; // Number of largest elements

        Arrays.sort(arr);

        // Print the k largest elements
        for (int i = 0; i < k; i++) {
            System.out.print(arr[arr.length - 1 - i] + " ");
        }
    }
}