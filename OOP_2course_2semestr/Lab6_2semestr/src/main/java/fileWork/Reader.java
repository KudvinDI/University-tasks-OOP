package fileWork;

import train.Train;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Reader{

    public static List<String> getListFromFile(String filename){
        List<String> collection = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filename), StandardCharsets.UTF_8);
            while (scanner.hasNext()){
                collection.add(scanner.next());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return collection;
    }
    public static List<Train> getTrainsFromFile(String filename){
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))) {
            return reader.lines().map(Train::of).toList();
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}



