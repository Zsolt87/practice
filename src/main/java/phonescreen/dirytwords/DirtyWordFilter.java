package phonescreen.dirytwords;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class DirtyWordFilter {

    private static final String DIRTY_FILE_PATH = "dirty_words.txt";

    public static void main(String[] args) {
        DirtyWordFilter dirtyWordFilter = new DirtyWordFilter();
        log.info("*** Result: {} ***", dirtyWordFilter.filter("fuck this shit"));
    }

    public String filter(String input){
        InputStream in = getClass().getClassLoader().getResourceAsStream(DIRTY_FILE_PATH);
        if(in == null){
            throw new IllegalArgumentException("Could not open file");
        }
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        List<String> inputAsList = new ArrayList<>(Arrays.asList(input.split(" ")));
        log.info("Started filtering: {}", inputAsList);
        try{
            String line;
            while((line = bufferedReader.readLine()) != null){
                log.info("Removing: {}", line);
                inputAsList.remove(line);
            }
        }catch(IOException e){
            log.error("Error occurred", e);
            throw new RuntimeException(e);
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                log.error("Error during close", e);
                throw new IllegalStateException(e);
            }
        }

        return inputAsList.stream().collect(Collectors.joining(" "));
    }
}
