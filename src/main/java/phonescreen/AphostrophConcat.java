package phonescreen;

import java.util.List;

public class AphostrophConcat {

    public static void main(String[] args) {
        System.out.println(concat("alma vagyok en foo bar", List.of("alma", "vagyok")));
    }

    public static String concat(String sentence, List<String> words){
        System.out.println("Original: " + sentence);
        String[] tokens = sentence.split(" ");

        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < tokens.length; i++){
            if(words.contains(tokens[i])){
                stringBuffer.append('\'');
                stringBuffer.append(tokens[i]);

                if(i == tokens.length || !words.contains(tokens[i+1]))
                    stringBuffer.append('\'');
            }else{
                stringBuffer.append(tokens[i]);
            }

            if(i != tokens.length-1)
                stringBuffer.append(" ");
        }

        return stringBuffer.toString();
    }
}