package recursivity;

public class Ex1and2Integers {
    public static void main(String[] args) {
        Integer n = 10;

        System.out.println("Sum of first " + n + " numbers = " + sumIntegerNumbers(n));
        System.out.println("Sum of first " + n + " even numbers = " + sumEvenIntegerNumbers(n));
    }

    private static Integer sumEvenIntegerNumbers(Integer n) {
        if (n == 1) {
            return 2;
        }
        return n * 2 + sumEvenIntegerNumbers(n - 1);
    }

    private static Integer sumIntegerNumbers(Integer n) {
        if (n == 1) {
            return 1;
        }
        return n + (sumIntegerNumbers(n - 1));
    }
}
