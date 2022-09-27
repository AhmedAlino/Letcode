package solutions.sorting_algorothm.selection_sort;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] numbers = new int[]{6, 4, 5, 3, 2, 1};
        System.out.println("Before selection sort applied: ");
        System.out.println(Arrays.toString(numbers));

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(numbers);

        System.out.println("After selection sort applied: ");
        System.out.println(Arrays.toString(numbers));
    }
}
