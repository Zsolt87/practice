package returncalculator.data;

import returncalculator.exception.TickerIsInvalidException;

public interface DataProvider {
  public double getPrice(String ticker) throws TickerIsInvalidException;
}
