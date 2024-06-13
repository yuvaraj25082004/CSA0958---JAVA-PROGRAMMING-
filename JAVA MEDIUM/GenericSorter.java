import java.util.Arrays;
import java.util.Scanner;
public class GenericSorter<T extends Comparable<T>> {
    private T[] array;
    public GenericSorter(T[] array) {
        this.array = array;
    }
    public void sort() {
        Arrays.sort(array);
    }
    public void display() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to sort: ");
        int intCount = scanner.nextInt();
        Integer[] intArray = new Integer[intCount];
        System.out.println("Enter the integers: ");
        for (int i = 0; i < intCount; i++) {
            intArray[i] = scanner.nextInt();
        }
        GenericSorter<Integer> intSorter = new GenericSorter<>(intArray);
        System.out.println("Before sorting: ");
        intSorter.display();
        intSorter.sort();
        System.out.println("After sorting: ");
        intSorter.display();
        System.out.println("Enter the number of strings you want to sort: ");
        int strCount = scanner.nextInt();
        scanner.nextLine(); 
        String[] strArray = new String[strCount];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < strCount; i++) {
            strArray[i] = scanner.nextLine();
        }
        GenericSorter<String> strSorter = new GenericSorter<>(strArray);
        System.out.println("Before sorting: ");
        strSorter.display();
        strSorter.sort();
        System.out.println("After sorting: ");
        strSorter.display();
        scanner.close();
    }
}
