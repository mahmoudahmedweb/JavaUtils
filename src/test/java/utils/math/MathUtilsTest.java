package utils.math;

public class MathUtilsTest {

    public static void main(String[] args) {
        testFindMax();
        testFindMin();
        testSum();
        testAverage();
        testProduct();
        testCalculateStandardDeviation();
        testCalculateSquareRoot();
    }

    public static void testFindMax() {
        int[] numbers = {1, 3, 5, 2, 4};
        System.out.println("Max value: " + MathUtils.findMax(numbers));
    }

    public static void testFindMin() {
        int[] numbers = {1, 3, 5, 2, 4};
        System.out.println("Min value: " + MathUtils.findMin(numbers));
    }

    public static void testSum() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + MathUtils.sum(numbers));
    }

    public static void testAverage() {
        int[] numbers = {1, 3, 5, 2, 4};
        System.out.println("Average value: " + MathUtils.calculateAverage(numbers));
    }
    public static void testProduct() {
        int[] numbers = {1, 3, 5, 2, 4};
        System.out.println("Product value: " + MathUtils.product(numbers));
    }
    public static void testCalculateStandardDeviation() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Standard deviation: " + MathUtils.calculateStandardDeviation(numbers));
    }

    public static void testCalculateSquareRoot() {
        System.out.println("Square root: " + MathUtils.calculateSquareRoot(25));
    }
}

