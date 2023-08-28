package solutions.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// O(n) time complexity
// O(n) space complexity
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);

        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++)
            hashMap.put(numbers[i], i);

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (hashMap.containsKey(complement) && hashMap.get(complement) != i)
                return new int[] {i, hashMap.get(complement)};
            hashMap.put(numbers[i], i);
        }
        return null;
    }
}

