import java.io.File;

public interface DoubleArrayReader {
    double[] readOneDimensionalArray(File file);

    double[] readOneDimensionalArray(String fileName);

    double[][] readTwoDimensionalArray(File file);

    double[][] readTwoDimensionalArray(String fileName);
}

