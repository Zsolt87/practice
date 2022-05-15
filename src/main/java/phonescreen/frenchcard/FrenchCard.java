package phonescreen.frenchcard;

import lombok.ToString;
import lombok.Value;

/*
Egy pakli négyféle, egyenként tizenhárom lapból álló sorozatból áll, ezek a fekete pikk, a piros káró, a fekete treff és a piros szív, avagy kőr. A sorok 2, 3, 4, 5, 6, 7, 8, 9, 10, bubi (J), dáma (Q), király (K), és ász (A)
 */

@Value
public class FrenchCard {
    public final static int NUMBER_OF_TYPES = 4;
    public final static int NUMBER_OF_SERIES = 13;
    public final static int MAX_VALUE = NUMBER_OF_SERIES * NUMBER_OF_TYPES;

    int value;

    //Pikk-1, Karo-2, Treff-3, Kor-4
    @ToString.Include
    public String getType(){
        int typeAsInteger = (value / 13);

        if(value <= 1 * NUMBER_OF_SERIES){
            return "PIKK";
        }else if(value <= 2 * NUMBER_OF_SERIES){
            return "KARO";
        }else if(value <= 3 * NUMBER_OF_SERIES){
            return "TREFF";
        }else if(value <= 4 * NUMBER_OF_SERIES){
            return "KOR";
        }else {
            throw new IllegalStateException("Could not find type");
        }
    }

    public int getSeriesValue(){
        return value % 13;
    }
}