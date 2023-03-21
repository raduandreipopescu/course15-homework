package recursivity;

public class Ex4DigitSum {
    public static void main(String[] args) {
        int number = 1020205;
        System.out.println("Sum of " + number + " digits is: " + sumOfDigits(number));
    }

    private static int sumOfDigits(int number) {
        if (number < 10) {
            return number;
        }
        return (number % 10) + sumOfDigits(number / 10);
    }
}
