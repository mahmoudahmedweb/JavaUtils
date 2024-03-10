package utils.datastructure;

import utils.datastructure.ResizingArrayStack;

import java.util.EmptyStackException;

public class ResizingArrayStackTest {

    public static void main(String[] args) {
        testPushAndPop();
        testPopEmptyStack();
        testPeekEmptyStack();
    }

    private static void testPushAndPop() {
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<>();
        System.out.println("Testing push and pop operations...");

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size after pushing: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popping elements...");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Size after popping: " + stack.size());
    }

    private static void testPopEmptyStack() {
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<>();
        System.out.println("\nTesting pop on empty stack...");
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Expected exception: " + e.getMessage());
        }
    }

    private static void testPeekEmptyStack() {
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<>();
        System.out.println("\nTesting peek on empty stack...");
        try {
            stack.peek();
        } catch (EmptyStackException e) {
            System.out.println("Expected exception: " + e.getMessage());
        }
    }
}
