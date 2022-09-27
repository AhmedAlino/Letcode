package solutions.sorting_algorothm.selection_sort;

public class SelectionSort {
    public void selectionSort(int[] array) {
        if (array.length == 0) return;
        for(int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] <  array[min]) {
                   min = j;
                }
            }
            swap(array, i, min);
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
