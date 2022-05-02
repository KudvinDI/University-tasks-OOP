package fileWork;
import train.Train;

import java.io.*;
import java.util.*;



public class BinaryReader {

    public static String getTrainsFromFile(String filename){
        try(FileInputStream fileInputStream = new FileInputStream(filename)){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (String) objectInputStream.readObject();
        }
         catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "";

    }
}
