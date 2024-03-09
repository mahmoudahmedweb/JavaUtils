package utils.math;

/**
 * Utility class for some array's mathematical operations.
 */
@lombok.Data
public class MathUtils {
    /**
     * Finds the maximum value in an array of integers
     * @param numbers
     * @return the maximum value
     * @throws IllegalArgumentException if the array is empty or null
     */

    public static int findMax(int[] numbers) {
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
     * Finds the minimum value in an array of integers
     * @param numbers
     * @return the minimum value
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static int findMin(int[] numbers) {

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
     * Finds the sum of the values in an array of integers
     * @param numbers
     * @return the sum value
     * @throws IllegalArgumentException if the array is empty or null
     */

    public static int sum(int[] numbers) {
        emptyOrNullArray(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    /**
     * Finds the Average of the value in an array of integers
     * @param numbers
     * @return the Average value
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static double calculateAverage(int[] numbers) {
        emptyOrNullArray(numbers);
        return (double) sum(numbers) / numbers.length;
    }

    /**
     * Finds the product of the values in an array of integers
     * @param numbers
     * @return the Product value
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static int product(int[] numbers) {
        emptyOrNullArray(numbers);

        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
    /**
     * Calculates the square root of a non-negative number using Newton's method.
     *
     * @param num the number to calculate the square root of
     * @return the square root of the input number
     * @throws IllegalArgumentException if the input number is negative
     */
    public static double calculateSquareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
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
    public static double calculateStandardDeviation(int[] numbers) {
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
    public static int abs(int num) {
        return num >= 0 ? num : -num;
    }

    /**
     * Returns the absolute value of a double.
     *
     * @param num the double value
     * @return the absolute value of the input double
     */
    public static double abs(double num) {
        return num >= 0 ? num : -num;
    }

    // Handling Exception if an Array is Empty or null
    public static void emptyOrNullArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(MathUtils.findMax(numbers));
        System.out.println(MathUtils.findMin(numbers));
        System.out.println(MathUtils.sum(numbers));
        System.out.println(MathUtils.calculateStandardDeviation(numbers));

    }


}