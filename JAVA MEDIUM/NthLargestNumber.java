import java.util.Arrays;
import java.util.Scanner;
public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();
        int nthLargest = findNthLargest(arr, N);
        System.out.println(N + "th Largest number: " + nthLargest);

        scanner.close();
    }
    public static int findNthLargest(int[] arr, int N) {
        Arrays.sort(arr);         int index = arr.length - N; 
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            return -1;         }
    }
}
