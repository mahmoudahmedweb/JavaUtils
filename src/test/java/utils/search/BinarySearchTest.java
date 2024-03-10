package utils.search;

public class BinarySearchTest {
    public static void main(String[] args) {
        // Test case with integers
        Integer[] intArray = {1, 3, 5, 7, 9, 11, 13, 15};
        BinarySearch<Integer> integerBinarySearch = new BinarySearch<>();
        int targetInt = 7;
        int indexInt = integerBinarySearch.search(intArray, targetInt);
        System.out.println("Index of " + targetInt + " in the integer array: " + indexInt);

        // Test case with strings
        String[] stringArray = {"apple", "banana", "cherry", "grape", "orange", "strawberry"};
        BinarySearch<String> stringBinarySearch = new BinarySearch<>();
        String targetString = "orange";
        int indexString = stringBinarySearch.search(stringArray, targetString);
        System.out.println("Index of \"" + targetString + "\" in the string array: " + indexString);
    }
}
