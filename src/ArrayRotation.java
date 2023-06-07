import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;

        rotateLeft(arr, x);

        // Print the rotated array
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateLeft(int[] arr, int x) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + (n - x)) % n;
            rotatedArray[newIndex] = arr[i];
        }

        // Copy the rotated array back to the original array
        System.arraycopy(rotatedArray, 0, arr, 0, n);
    }
}