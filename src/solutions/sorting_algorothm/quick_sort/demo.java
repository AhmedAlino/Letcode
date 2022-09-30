package solutions.sorting_algorothm.quick_sort;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] numbers = new int[]{6, 4, 5, 3, 2, 1};
        System.out.println("Before quick sort applied: ");
        System.out.println(Arrays.toString(numbers));

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(numbers, 0, numbers.length - 1);

        System.out.println("After quick sort applied: ");
        System.out.println(Arrays.toString(numbers));
    }
}
