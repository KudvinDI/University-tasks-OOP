import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReaderTest {

    double EPS = 1e-9;
    ArrayReader arrayReader;
    @BeforeEach
    void setup()
    {
        try{
            PrintWriter printWriter = new PrintWriter("TestOne12.txt");
            printWriter.println("10");
            printWriter.println("-1.2 -2.3 4.2 5.2 2.3 6.1 2.4 8.1 9.4 1.2");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            PrintWriter printWriter = new PrintWriter("TestOne13.txt");
            printWriter.println("3");
            printWriter.println("-1.2 -2.3 4.2");
            printWriter.println("5.2 2.3 6.1");
            printWriter.println("2.4 8.1 9.4");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        arrayReader = new ArrayReader();
    }
    @AfterEach
    void tearDown(){
        new File("TestOne12.txt").delete();
        new File("TestOne13.txt").delete();
    }
    @Test
    void readOneDimensionalArray() {
        double[] expected = {-1.2, -2.3, 4.2, 5.2, 2.3, 6.1, 2.4, 8.1, 9.4, 1.2};
        double[] result = arrayReader.readOneDimensionalArray("TestOne12.txt");
        assertArrayEquals(expected, result, EPS);


    }

    @Test
    void readTwoDimensionalArray() {
        double[][] expected= {{-1.2, -2.3, 4.2}, {5.2, 2.3, 6.1}, {2.4, 8.1, 9.4}};
        double[][] result = arrayReader.readTwoDimensionalArray("TestOne13.txt");
        assertArrayEquals(expected[0], result[0], EPS);
        assertArrayEquals(expected[1], result[1], EPS);
        assertArrayEquals(expected[2], result[2], EPS);
    }
}