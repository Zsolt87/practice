package returncalculator.exception;

public class TickerIsInvalidException extends Exception {

  public TickerIsInvalidException() {
    super();
  }

  public TickerIsInvalidException(String message) {
    super(message);
  }
}
