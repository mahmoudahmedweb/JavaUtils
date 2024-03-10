package utils.datastructure;

/**
 * Exception thrown when attempting to perform operations on an empty queue.
 */
public class EmptyQueueException extends RuntimeException {
    /**
     * Constructs a new EmptyQueueException with the specified detail message.
     * @param message the detail message (which is saved for later retrieval by the getMessage() method)
     */
    public EmptyQueueException(String message) {
        super(message);
    }
}
