package phonescreen.frenchcard;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class Person {
    List<FrenchCard> cards = new ArrayList<>();
}
