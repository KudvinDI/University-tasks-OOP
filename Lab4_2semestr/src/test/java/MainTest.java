import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
 Main main;
 final double EPS = 1e-9;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void testFillx() {
        double start = 0.2;
        double finish = 2;
        double step = 0.004;
        double[] expected = {0.2, 0.9, 2};
        double[] result = main.fillx(0.2, 2, 0.004);
        assertArrayEquals(expected, new double[]{result[0], result[175], result[450]}, EPS);


    }

    @Test
    void testCountSteps() {
        double start = 0;
        double finish = 10;
        double step = 0.1;
        int expected = 101;
        int result = main.countSteps(start, finish, step);
        assertEquals(expected, result);


    }

    @Test
    void testCalcY2() {
        double x = 1;
        double result = main.calcY(x);
        double expected = 2.098063826;
        assertEquals(expected, result, EPS );

    }

    @Test
    void testCalcY() {
        double x = 0.8;
        double result = main.calcY(x);
        double expected = 0.363089235;
        assertEquals(expected, result, EPS );


    }
    @Test
    void testFillY(){

        double[] xArray = main.fillx(0.2, 2, 0.004);
        double[] result = main.fillY(xArray);
        double[] expected = {-2.665200954, 0.459384803, 1.402861146};
        assertArrayEquals(expected, new double[]{result[0], result[175], result[450]}, EPS);

    }
    @Test
    void testFindIndexOfMax(){
        double[] yArray = { 0, 1, 2, 6, 8, 9, 2, 3};
        int expected = 5;
        int result = main.findIndexOfMax(yArray);
        assertEquals(expected, result);
    }
    @Test
    void testFindIndexOfMin(){
        double[] yArray = { 2, 1, 2, 6, 8, 9, 0, 3};
        int expected = 6;
        int result = main.findIndexOfMin(yArray);
        assertEquals(expected, result);
    }
    @Test
    void testSumOfArray(){
        double[] yArray = {2, 1, 3, 4, 1, 6};
        double expected = 17.0;
        double result = main.calculateSumOfArray(yArray);
        assertEquals(expected, result);
    }
    @Test
    void testAverageOfArray(){
        double[] yArray = {2, 3, 3, 2 , 1, 1};
        double expected = 2;
        double result = main.calculateAverageOfArray(yArray);
        assertEquals(expected, result);
    }

}