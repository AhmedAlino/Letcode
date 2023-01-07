package integerPalindrome;

import java.util.Stack;

public class MySolution {
    public static void main(String[] args) {
        System.out.println(isAtoi(1));
        System.out.println(isAtoi(10));
        System.out.println(isAtoi(11));
        System.out.println(isAtoi(12));
        System.out.println(isAtoi(0));
        System.out.println(isAtoi(-1));
        System.out.println(isAtoi(-23));
        System.out.println(isAtoi(-22));
    }

    private static boolean isAtoi(int x) {
        if(x < 0) return false;
        if (x >= Integer.MAX_VALUE) return false;
        if (x > 0 && x < 10) return true;
        else {
            Stack<Character> stack = new Stack<>();
            String numAsString = Integer.toString(x);
            for (int i = 0; i < numAsString.length(); i++) {
                stack.push(numAsString.charAt(i));
            }
            StringBuilder revNumAsString = new StringBuilder();
            while (!stack.isEmpty()) {
                revNumAsString.append(stack.pop());
            }
            try {
                if (Integer.parseInt(revNumAsString.toString()) == x) return true;
            } catch(NumberFormatException e) {
                return false;
            }
        }
        return false;
    }
}
