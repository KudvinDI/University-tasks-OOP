import com.example.web3.Calculation;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {


    @org.junit.jupiter.api.Test
    void calculateIterations() {
        Calculation calculation = new Calculation(0.2, 2, 0.004);
        assertEquals(451, calculation.calculateIterations(0.2, 2, 0.004));

    }

    @org.junit.jupiter.api.Test
    void dataInputToArrays() {
        Calculation calculation = new Calculation(0.2, 2, 0.004);
        double delta = 0.001;
        assertEquals(-2.665, calculation.getYByIndex(0), delta );
        assertEquals(2.871, calculation.getYByIndex(175), delta );
        assertEquals(1.413, calculation.getYByIndex(450), delta );

    }


    @org.junit.jupiter.api.Test
    void findMax() {
        Calculation calculation = new Calculation(0.2, 2, 0.004);
        double delta = 0.001;
        assertEquals(2.871, Double.parseDouble(calculation.findMax()), delta);

    }

    @org.junit.jupiter.api.Test
    void findMin() {
        Calculation calculation = new Calculation(0.2, 2, 0.004);
        double delta = 0.001;
        assertEquals(-2.665, Double.parseDouble(calculation.findMin()), delta);
    }

    @org.junit.jupiter.api.Test
    void sumOfValue() {
        Calculation calculation = new Calculation(0.2, 2, 0.004);
        double delta = 0.001;
        assertEquals(-2.665, Double.parseDouble(calculation.findMin()), delta);
    }

    @org.junit.jupiter.api.Test
    void averageValue() {
        Calculation calculation = new Calculation(0.2, 2, 0.004);
        double delta = 0.001;
        assertEquals(-2.665, Double.parseDouble(calculation.findMin()), delta);
    }
}