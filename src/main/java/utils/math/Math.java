package utils.math;

@lombok.Data
public class Math {
    // Finding maximum of integers

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

    public static int sum(int[] numbers) {
        emptyOrNullArray(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static double calculateAverage(int[] numbers) {
        emptyOrNullArray(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static int product(int[] numbers) {
        emptyOrNullArray(numbers);

        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
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
    public static double calculateStandardDeviation(int[] numbers) {
        emptyOrNullArray(numbers);

        // Calculate the mean (average)
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double mean = sum / numbers.length;

        // Calculate the sum of squared differences
        double sumSquaredDifferences = 0;
        for (int number : numbers) {
            double difference = number - mean;
            sumSquaredDifferences += difference * difference;
        }

        // Calculate the variance
        double variance = sumSquaredDifferences / numbers.length;

        // Calculate the standard deviation (square root of variance)
        double standardDeviation = Math.calculateSquareRoot(variance);

        return standardDeviation;
    }

    public static int abs(int num) {
        return num >= 0 ? num : -num;
    }

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

        System.out.println(Math.findMax(numbers));
        System.out.println(Math.findMin(numbers));
        System.out.println(Math.sum(numbers));
        System.out.println(Math.calculateStandardDeviation(numbers));

    }


}