package pt.pa.adts.queue;

/**
 * An exception that signals that a queue is empty.
 *
 * This exception should be thrown whenever an access is attempted on an empty queue.
 */
public class QueueEmptyException extends RuntimeException {

    public QueueEmptyException() {
      throw new UnsupportedOperationException("There is no more capacity or memory for this element.");
    }

    public QueueEmptyException(String message) {
      throw new UnsupportedOperationException(message);
    }
}