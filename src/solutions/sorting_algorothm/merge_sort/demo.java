package solutions.sorting_algorothm.merge_sort;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] numbers = new int[]{6, 4, 5, 3, 2, 1};
        System.out.println("Before merge sort applied: ");
        System.out.println(Arrays.toString(numbers));

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(numbers);

        System.out.println("After merge sort applied: ");
        System.out.println(Arrays.toString(numbers));
    }
}
