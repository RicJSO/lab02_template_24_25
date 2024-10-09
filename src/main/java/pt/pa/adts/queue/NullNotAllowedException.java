package pt.pa.adts.queue;

public class NullNotAllowedException extends RuntimeException {
    public NullNotAllowedException() {
        throw new UnsupportedOperationException("Element is null and the implementation does not allow nulls.");
    }

  public NullNotAllowedException(String message) {
    throw new UnsupportedOperationException(message);
  }
}
