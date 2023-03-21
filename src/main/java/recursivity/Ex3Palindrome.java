package recursivity;

public class Ex3Palindrome {
    public static void main(String[] args) {
        String palindromeOrNot = "eerrrree";

        System.out.println("Check 1: Is " + palindromeOrNot + " a palindrome? " + palindromeCheck1(palindromeOrNot));
        System.out.println("Check 2: Is " + palindromeOrNot + " a palindrome? " + palindromeCheck2(palindromeOrNot));
    }

    private static boolean palindromeCheck1(String palindromeOrNot) {
        return palindromeOrNot.equals(reverseString(palindromeOrNot));
    }

    private static String reverseString(String initialString) {
        if (initialString.length() == 1) {
            return initialString;
        }
        return reverseString(initialString.substring(1)) + initialString.charAt(0);
    }

    private static boolean palindromeCheck2(String palindromeOrNot) {
        if (palindromeOrNot.length() < 2) {
            return true;
        }
        if (palindromeOrNot.charAt(0) == palindromeOrNot.charAt(palindromeOrNot.length() - 1)) {
            String subString = palindromeOrNot.substring(1, palindromeOrNot.length() - 1);
            return palindromeCheck2(subString);
        } else {
            return false;
        }
    }
}
