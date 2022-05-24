import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTasksTest {
    ArrayTasks arrayTasks;
    final double EPS = 1e-9;



    @BeforeEach
    void setup()
    {
        arrayTasks = new ArrayTasks();
    }

    @Test//Знайти різницю першого та останнього додатних елементів масиву
    void testCalculateOneDimensionalArray() {
        double[] array = {-1, 2.4, 43.1, 23.4, 12, -4.1, 4.3, -4.2};
        double expected = -1.9;
        double result = arrayTasks.calculate(array);
        assertEquals(expected, result, EPS);

    }
    @Test
    void testCalculateTwoDimensionalArray() {
        int size = 5;
        double[][] array = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j=0; j< size; j++){
                array[i][j] = 3;
            }
        }
        double expected =51;
        double result = arrayTasks.calculate(array);
        assertEquals(expected, result);





    }



}