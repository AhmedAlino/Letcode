package solutions.longest_substring_no_repeated_characters;

import java.util.Arrays;

public class Solution {
    //TODO:
    //The solution to this problem is to be done!
    public static void main(String[] args) {
        int[] numbers = new int[] {3, 2, 1};
        System.out.println(maxSum(numbers, 5));

        System.out.println("Maximun sum using the sliding window technique");
        System.out.println(maxSumWithSlidingWindow(numbers, numbers.length, 5));
    }

    static int maxSum(int[] arr, int k) {
        int maxSum = 0;
        for (int i = 0; i < arr.length - k + 1; i++) {
            int currSum = 0;
            for (int j = i; j < k + i; j++) {
                currSum += arr[j];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    static int maxSumWithSlidingWindow(int[] arr, int size, int k) {
        if (size < k) return -1;
        // computing the sun of the first window
        int maxSum = 0;
        for(int i = 0; i < k; i++) maxSum += arr[i];

        //compute the sum of the rest of the window with the length k
        int windowSum = maxSum;
        for (int i = k; i < size; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
