package phonescreen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentWord {

    public static void main(String[] args) {
        System.out.println(mostFrequentWord("alma alma korte banan korte korte banan egy korte tyuk"));
        System.out.println(mostFrequentWordWithMap("alma alma korte banan korte korte banan egy korte tyuk"));
    }

    public static String mostFrequentWord(String input){
        String result = "";
        String[] splitInput = input.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        int max = -1;

        for(String word: splitInput){
            int count = wordCount.getOrDefault(word, 0);
            count++;
            wordCount.put(word, count);

            if(max < count){
                max = count;
                result = word;
            }
        }
        System.out.println(wordCount);

        return result;
    }

    public static String mostFrequentWordWithMap(String input){
        String result = "";
        String[] splitInput = input.split(" ");

        return Arrays.stream(splitInput).collect(Collectors.toMap(
                s -> s,
                s -> 1,
                (v1,v2) -> v1 + v2))
                .entrySet()
                .stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
    }
}
