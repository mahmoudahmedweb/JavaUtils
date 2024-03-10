package utils.datastructure;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(1);
        list.add(2);
        list.add(3);

        // Print the size of the ArrayList
        System.out.println("Size: " + list.size()); // Should print 3

        // Print the elements of the ArrayList
        System.out.print("Elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); // Should print "1 2 3"

        // Access an element by index
        System.out.println("Element at index 1: " + list.get(1)); // Should print 2
    }
}
