import java.util.Arrays;
public class FindMthMaxNthMin {
    public static void main(String[] args) {
        int[] array1 = {14, 16, 87, 36, 25, 89, 34};
        int M1 = 1;
        int N1 = 3;
        processArray(array1, M1, N1);
        int[] array2 = {16, 16, 16, 16, 16};
        int M2 = 0;
        int N2 = 1;
        processArray(array2, M2, N2);
        int[] array3 = {0, 0, 0, 0};
        int M3 = 1;
        int N3 = 2;
        processArray(array3, M3, N3);
        int[] array4 = {-12, -78, -35, -42, -85};
        int M4 = 3;
        int N4 = 3;
        processArray(array4, M4, N4);
        int[] array5 = {15, 19, 34, 56, 12};
        int M5 = 6;
        int N5 = 3;
        processArray(array5, M5, N5);
        int[] array6 = {85, 45, 65, 75, 95};
        int M6 = 5;
        int N6 = 7;
        processArray(array6, M6, N6);
    }
    public static void processArray(int[] array, int M, int N) {
        if (M <= 0 || N <= 0 || M > array.length || N > array.length) {
            System.out.println("Invalid M or N value for the array: " + Arrays.toString(array));
            return;
        }
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int mthMax = sortedArray[sortedArray.length - M];
        int nthMin = sortedArray[N - 1];
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;
        System.out.println(M + "th Maximum Number = " + mthMax);
        System.out.println(N + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println();
    }
}
