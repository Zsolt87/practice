package returncalculator.portfolio;

import lombok.Data;
import returncalculator.asset.Asset;

import java.util.ArrayList;
import java.util.List;

@Data
public class Portfolio {
  List<Asset> assetList = new ArrayList<>();
}
