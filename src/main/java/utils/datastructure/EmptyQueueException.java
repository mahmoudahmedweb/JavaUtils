package utils.datastructure;

/**
 * Exception thrown when attempting to perform operations on an empty queue.
 */
public class EmptyQueueException extends RuntimeException {
    /**
     * Constructs a new EmptyQueueException with the specified detail message.
     * @param message the detail message
     */
    public EmptyQueueException(final String message) {

        super(message);
    }
}
