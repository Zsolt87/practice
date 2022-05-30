package returncalculator.asset;

import lombok.Data;
import lombok.Value;

@Value
public class Asset {
  private AssetType assetType;
  private String ticker;
  private int quantity;
}
