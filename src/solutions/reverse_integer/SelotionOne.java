package solutions.reverse_integer;

public class SelotionOne {
    public static void main(String[] args) {
        //        int number = 123;
//        int number = -123;
        int number = -321;
//        int number = 120;
//        int number = Integer.MIN_VALUE;
////        int number = Integer.MAX_VALUE;
//        int number = 1534236469;

        System.out.println(reverseInteger(number));
    }

    /**
     * reverse an integer [using the pop and push methodology without stack/array]
     * @param number number to reverse
     * @return the reverse number; Or 0 if the reversed number overflow the range [-2^31, 2^31 - 1]
     */
    public static int reverseInteger(int number) {
        int reverse = 0;
        while (number != 0) {
            int pop = number % 10;
            number /= 10;

            if (reverse > Integer.MAX_VALUE / 10)
                return 0;
            if (reverse < Integer.MIN_VALUE / 10)
                return 0;

            reverse = reverse * 10 + pop;
        }

        return reverse;
    }
}
