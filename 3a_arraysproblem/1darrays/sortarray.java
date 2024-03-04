import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};

        // Sort in ascending order
        Arrays.sort(arr);
        System.out.println("Array sorted in ascending order: " + Arrays.toString(arr));

        // Sort in descending order
        int[] arrDesc = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrDesc[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Array sorted in descending order: " + Arrays.toString(arrDesc));
    }
}
