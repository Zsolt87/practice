package returncalculator.portfolio;

import returncalculator.asset.Asset;
import returncalculator.asset.AssetType;

public class PortfolioProvider {
  public Portfolio buildSamplePortfolio() {
    Portfolio portfolio = new Portfolio();
    portfolio.getAssetList().add(new Asset(AssetType.EQUITY, "APPL", 15));
    portfolio.getAssetList().add(new Asset(AssetType.EQUITY, "OMC", 5));
    portfolio.getAssetList().add(new Asset(AssetType.EQUITY, "TROW", 50));
    return portfolio;
  }
}
