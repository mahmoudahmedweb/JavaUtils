import utils.datastructure.StackLinkedList;
import java.util.EmptyStackException;

public class StackLinkedListTest {
    public static void main(String[] args) {
        testStackOperations();
    }

    private static void testStackOperations() {
        StackLinkedList<Integer> stack = new StackLinkedList<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Printing stack contents
        System.out.println("Stack contents after pushing elements:");
        printStackContents(stack);

        // Peeking at the top element
        System.out.println("Peek: " + stack.peek());

        // Popping elements from the stack
        try {
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            // Trying to pop from an empty stack
            System.out.println("Pop: " + stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

    private static void printStackContents(StackLinkedList<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        StackLinkedList<Integer> tempStack = new StackLinkedList<>();
        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println(element);
            tempStack.push(element);
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}

