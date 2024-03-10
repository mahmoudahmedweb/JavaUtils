package utils.sorting;

import utils.sorting.MergeSort;

import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 7};
        System.out.println("Original array: " + Arrays.toString(intArray));
        MergeSort<Integer> intSorter = new MergeSort<>();
        intSorter.sort(intArray);
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }
}