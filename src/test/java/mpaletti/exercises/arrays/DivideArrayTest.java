package mpaletti.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrayTest {

    private static final double DELTA = 1e-09;
    @Test
    void divideArray() {
        assertArrayEquals(new double[]{0.5, 0.5, 0.5}, DivideArray.divideArray(new double[]{1, 1, 1}, 2.0), DELTA);
        assertArrayEquals(new double[]{2.0, 1.0, 1.0}, DivideArray.divideArray(new double[]{2, 1, 1}, 1.0), DELTA);
        assertArrayEquals(new double[]{1.0, 1.0}, DivideArray.divideArray(new double[]{10, 10}, 10.0), DELTA);
    }
}