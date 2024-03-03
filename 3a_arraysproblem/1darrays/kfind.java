import java.util.Scanner;
package 3a_arraysproblem.1darrays;

public class kfind {
    public class NumberPositionFinder {
        public static int findPosition(int[] arr, int num) {
            // Iterate through the array to find the position of the number
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    return i; // Return the index if the number is found
                }
            }
            return -1; // Return -1 if the number is not found in the array
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Input array
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
    
            // Input number to find
            System.out.print("Enter the number to find: ");
            int num = scanner.nextInt();
    
            // Find position of the number
            int position = findPosition(arr, num);
            if (position != -1) {
                System.out.println("The number " + num + " is found at position: " + position);
            } else {
                System.out.println("The number " + num + " is not found in the array.");
            }
    
            scanner.close();
        }    
   }
}
