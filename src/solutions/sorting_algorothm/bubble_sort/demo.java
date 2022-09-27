package solutions.sorting_algorothm.bubble_sort;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] numbers = new int[]{6, 4, 5, 3, 2, 1};
        System.out.println("After bubble sort applied: ");
        System.out.println(Arrays.toString(numbers));

       BubbleSort bubbleSort = new BubbleSort();
       bubbleSort.bubbleSort(numbers);

        System.out.println("After bubble sort applied: ");
        System.out.println(Arrays.toString(numbers));

    }
}
