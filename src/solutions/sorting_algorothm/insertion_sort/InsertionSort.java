package solutions.sorting_algorothm.insertion_sort;

public class InsertionSort {
    public void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int unsortedValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] >= unsortedValue) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = unsortedValue;
        }
    }
}
