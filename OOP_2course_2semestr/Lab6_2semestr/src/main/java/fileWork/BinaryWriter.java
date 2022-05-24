package fileWork;
import train.Train;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


public class BinaryWriter {
    public static void writeObjectToFile(String filename, List<Train> trainList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeChars(trainList.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
