package solutions.sorting_algorothm.insertion_sort;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] numbers = new int[]{6, 4, 5, 3, 2, 1};
        System.out.println("After insertion sort applied: ");
        System.out.println(Arrays.toString(numbers));

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(numbers);

        System.out.println("After insertion sort applied: ");
        System.out.println(Arrays.toString(numbers));
    }
}
