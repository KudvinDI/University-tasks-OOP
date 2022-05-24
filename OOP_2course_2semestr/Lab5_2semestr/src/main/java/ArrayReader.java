import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArrayReader implements DoubleArrayReader{
    @Override
    public double[] readOneDimensionalArray(File file) {
        try (Scanner scanner = new Scanner(file)) {
            int size = scanner.nextInt();
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextDouble();
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }

    @Override
    public double[] readOneDimensionalArray(String fileName) {
        return readOneDimensionalArray(new File(fileName));

    }

    @Override
    public double[][] readTwoDimensionalArray(File file) {
        try (Scanner scanner = new Scanner(file)) {
            int size = scanner.nextInt();
            double[][] arr = new double[size][size];
            for (int i = 0; i < arr.length; i++) {
                for(int j=0; j< arr[i].length; j++)
                    arr[i][j]= scanner.nextDouble();
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }


    @Override
    public double[][] readTwoDimensionalArray(String fileName) {
        return readTwoDimensionalArray(new File(fileName));
    }
}
