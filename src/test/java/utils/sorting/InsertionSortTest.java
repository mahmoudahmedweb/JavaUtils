package utils.sorting;

import utils.sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSortTest {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 7};
        System.out.println("Original array: " + Arrays.toString(intArray));
        InsertionSort<Integer> intSorter = new InsertionSort<>();
        intSorter.sort(intArray);
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }
}
