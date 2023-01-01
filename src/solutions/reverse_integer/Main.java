package solutions.reverse_integer;

public class Main {
    public static void main(String[] args) {
//        int number = 123;
//        int number = -123;
//        int number = -321;
//        int number = 120;
//        int number = Integer.MIN_VALUE;
//        int number = Integer.MAX_VALUE;
        int number = 1534236469;

        System.out.println(reverse(number));
    }

    public static int reverse(int number) {
        if (number > 0 && number < Integer.MAX_VALUE)
            return reversePositiveInt(number);
        if (number < 0 && number > Integer.MIN_VALUE) {
            int positiveNumber = -1 * number;
            return reversePositiveInt(positiveNumber);
        }
        return 0;
    }

    private static int reversePositiveInt(int number) {
        String numberAsString = Integer.toString(number);
        StringBuilder reverseNumberAsString = new StringBuilder("");

        for (int i = numberAsString.length() - 1; i >= 0; i--)
            reverseNumberAsString.append(numberAsString.charAt(i));

        int numberReverse = (int) Double.parseDouble(reverseNumberAsString.toString());
        final int LEFT_BOUND = Integer.MIN_VALUE;
        final int RIGHT_BOUND = Integer.MAX_VALUE;

        if (LEFT_BOUND < numberReverse && numberReverse < RIGHT_BOUND)
            return numberReverse;

        return 0;
    }
}
