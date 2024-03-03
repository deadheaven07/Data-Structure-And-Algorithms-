import java.util.Scanner;
package 3a_arraysproblem.1darrays;

public class input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = s.nextInt(); // Size of array
        
        int[] arr = new int[n]; // Creating array of size n
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt(); // Taking input for each element of the array
        }

        // Printing the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
