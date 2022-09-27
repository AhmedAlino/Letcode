package solutions.longest_substring_no_repeated_characters;

import java.util.Arrays;

public class JustATest {
    public static void main(String[] args) {
        int[] array = new int[]{0, 2, 3, 4};
        int[] p  =  product(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(p));
    }

    static int[] product(int[] arr) {
        int p = 1;
        int[] resultArray = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            p = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                p *= arr[j];
            }
            resultArray[i] = p;
        }
        return resultArray;
    }
}
