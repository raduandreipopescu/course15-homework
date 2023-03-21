package recursivity;

import java.util.HashMap;
import java.util.Map;

public class Ex5Fibonacci {

    public static void main(String[] args) {

        long targetElement = 25;
        System.out.println("(Standard) Element number " + targetElement + " in Fibonacci's array is: " + getElementInFibonacciStandard(targetElement - 1));
        System.out.println("(Optimized) Element number " + targetElement + " in Fibonacci's array is: " + getElementInFibonacciOptimized(targetElement - 1));
    }

    static Map<Long, Long> calculatedFibonacciElements = new HashMap<>();

    private static long getElementInFibonacciOptimized(long targetElement) {
        if (targetElement <= 1) {
            return targetElement;
        }
        if (calculatedFibonacciElements.containsKey(targetElement)) {
            return calculatedFibonacciElements.get(targetElement);
        }

        Long previousElementValue = getElementInFibonacciOptimized(targetElement - 1);
        calculatedFibonacciElements.put((targetElement - 1), previousElementValue);
        Long secondPreviousElementValue = getElementInFibonacciOptimized(targetElement - 2);
        calculatedFibonacciElements.put((targetElement - 2), secondPreviousElementValue);

        return previousElementValue + secondPreviousElementValue;
    }

    private static Long getElementInFibonacciStandard(Long targetElement) {
        if (targetElement == 1) {
            return 1L;
        } else if (targetElement == 0) {
            return 0L;
        } else {
            return getElementInFibonacciStandard(targetElement - 2) + getElementInFibonacciStandard(targetElement - 1);
        }
    }
}
