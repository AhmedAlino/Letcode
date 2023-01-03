package solutions.reverse_integer;

public class SolutionTwo {
    public static void main(String[] args) {
//        int number = 123;
//        int number = -123;
//        int number = -321;
//        int number = 120;
//        int number = Integer.MIN_VALUE;
//        int number = Integer.MAX_VALUE;
        int number = 1534236469;
        System.out.println(reverseInteger(number));
    }

    public static int reverseInteger(int number) {
        String revAsString = new StringBuilder("").append(Math.abs(number)).reverse().toString();
        try {
            int rev = Integer.parseInt(revAsString);
            if (number > 0) return rev;
            if (number < 0) return -1 * rev;
        } catch (NumberFormatException e) {
            return 0;
        }
        return 0;
    }
}
