package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Hornole1Test {
    @Test
    public void factorialTestInput1() {
        Hornole1 hornole1 = new Hornole1();
        int n = 1;
        long expected_result = 1;

        long result = hornole1.factorial(n);

        Assertions.assertEquals(expected_result, result);
    }

    @Test
    public void factorialTestInput2() {
        Hornole1 hornole1 = new Hornole1();
        int n = 2;
        long expected_result = 2;

        long result = hornole1.factorial(n);

        Assertions.assertEquals(expected_result, result);
    }

    @Test
    public void factorialTestInput3() {
        Hornole1 hornole1 = new Hornole1();
        int n = 3;
        long expected_result = 6;

        long result = hornole1.factorial(n);

        Assertions.assertEquals(expected_result, result);
    }
}
