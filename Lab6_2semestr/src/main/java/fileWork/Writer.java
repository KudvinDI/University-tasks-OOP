package fileWork;


import train.Train;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Writer {


    public static void writeObjectToFile(String filename, List<?> objectList){
        try {
            PrintWriter writer =new PrintWriter(filename);
            for (Object o : objectList) {
                writer.println(o);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
