package solutions.sorting_algorothm.merge_sort;

public class MergeSort {
    public void mergeSort(int[] array) {
        if (array.length <= 1) return;

        int length = array.length;
        int mid = length / 2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        int l = 0;
        int r = 0;
        int a = 0;

        //Fill in the both array
        while (a < length) {
            if (a < mid) {
                leftArray[l] = array[a];
                l++;
            } else {
                rightArray[r] = array[a];
                r++;
            }
            a++;
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);
    }

    private void merge(int[] array, int[] lArray, int[] rArray) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int l = 0;
        int r = 0;
        int a = 0;

        while (l < leftSize && r <rightSize) {
            if (lArray[l] < rArray[r]) {
                array[a] = lArray[l];
                l++;
            } else {
                array[a] = rArray[r];
                r++;
            }
             a++;
        }

        while (l < leftSize) {
            array[a] = lArray[l];
            l++;
            a++;
        }

        while (r < rightSize) {
            array[a] = rArray[r];
            r++;
            a++;
        }
    }
}
