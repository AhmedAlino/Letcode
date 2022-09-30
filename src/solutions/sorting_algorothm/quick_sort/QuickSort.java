package solutions.sorting_algorothm.quick_sort;

public class QuickSort {
    public void quickSort(int[] array, int start, int end) {
        if (start > end) return;
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    public int partition(int[] array, int start, int end) {
        int pivot = end;
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (array[j] < array[pivot]) {
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, pivot);
        return i;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
