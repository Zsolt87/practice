package returncalculator.data;

import returncalculator.asset.TickerValidator;
import returncalculator.exception.TickerIsInvalidException;

// TODO: read from files
public class FileDataProvider implements DataProvider {

  TickerValidator tickerValidator = new TickerValidator();

  @Override
  public double getPrice(String ticker) throws TickerIsInvalidException {
    if (!tickerValidator.isTickerValid(ticker)) {
      throw new TickerIsInvalidException(String.format("Ticker %s is invalid"));
    }
    return 0;
  }
}
