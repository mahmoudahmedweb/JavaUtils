package utils.math;

/**
 * Utility class for some array's mathematical operations.
 */
public final class MathUtils {

    /**
     * Private constructor to prevent instantiation of
     * the {@code MathUtils} utility class.
     * This class provides static methods for mathematical operations
     * on arrays. It is not meant to be instantiated.
     * @throws AssertionError if an attempt is made to instantiate the
     * class
     */
    private MathUtils() {
        // Private constructor to prevent instantiation
        throw new AssertionError("Utility class MathUtils "
                + "cannot be instantiated");
    }
    /**
     * Finds the maximum value in an array of integers.
     * @param numbers the array of integers
     * @return the maximum value
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static int findMax(final int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    /**
     * Finds the minimum value in an array of integers.
     * @param numbers the array of integers
     * @return the minimum value
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static int findMin(final int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    /**
     * Finds the sum of the values in an array of integers.
     * @param numbers the array of integers
     * @return the sum value
     * @throws IllegalArgumentException if the array is empty or null
     */

    public static int sum(final int[] numbers) {
        emptyOrNullArray(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    /**
     * Finds the Average of the value in an array of integers.
     * @param numbers the array of integers
     * @return the Average value
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static double calculateAverage(final int[] numbers) {
        emptyOrNullArray(numbers);
        return (double) sum(numbers) / numbers.length;
    }

    /**
     * Finds the product of the values in an array of integers.
     * @param numbers the array of integers
     * @return the Product value
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static int product(final int[] numbers) {
        emptyOrNullArray(numbers);

        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
    /**
     * Calculates the square root of a non-negative
     * number using Newton's method.
     *
     * @param num the number to calculate the square root of
     * @return the square root of the input number
     * @throws IllegalArgumentException if the input number is negative
     */
    public static double calculateSquareRoot(final double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square "
                    + "root of a negative number");
        }

        double guess = num / 2; // Initial guess
        double epsilon = 0.000001; // Threshold for precision

        while (Math.abs(guess * guess - num) > epsilon) {
            guess = (guess + num / guess) / 2; // Newton's method
        }

        return guess;
    }
    /**
     * Calculates the standard deviation of an array of integers.
     *
     * @param numbers the array of integers
     * @return the standard deviation
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static double calculateStandardDeviation(final int[] numbers) {
        emptyOrNullArray(numbers);

        // Calculate the mean (average)
        double mean = sum(numbers) / numbers.length;

        // Calculate the sum of squared differences
        double sumSquaredDifferences = 0;
        for (int number : numbers) {
            double difference = number - mean;
            sumSquaredDifferences += difference * difference;
        }

        // Calculate the variance
        double variance = sumSquaredDifferences / numbers.length;

        // Calculate the standard deviation (square root of variance)
        double standardDeviation = MathUtils.calculateSquareRoot(variance);

        return standardDeviation;
    }
    /**
     * Returns the absolute value of an integer.
     *
     * @param num the integer value
     * @return the absolute value of the input integer
     */
    public static int abs(final int num) {
        return num >= 0 ? num : -num;
    }

    /**
     * Returns the absolute value of a double.
     *
     * @param num the double value
     * @return the absolute value of the input double
     */
    public static double abs(final double num) {
        return num >= 0 ? num : -num;
    }

    /**
     * Checks if the given array is null or empty.
     * @param numbers numbers the array of integers to check
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static void emptyOrNullArray(final int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
    }
}
