package phonescreen;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueListWithOrderOfAppearance {

    public static void main(String[] args) {
        appearance("alma korte alma korte banan alma");
        appearanceWithStream("alma korte alma korte banan alma");
    }

    public static void appearance(String input){
        String[] splitInput = input.split(" ");

        Set<String> orderedWords = new LinkedHashSet<>();
        Collections.addAll(orderedWords, splitInput);

        orderedWords.forEach( s -> System.out.println(s));
    }

    public static void appearanceWithStream(String input){
        String[] splitInput = input.split(" ");

        System.out.println(Arrays.stream(splitInput).distinct().collect(Collectors.toList()));

    }

}
