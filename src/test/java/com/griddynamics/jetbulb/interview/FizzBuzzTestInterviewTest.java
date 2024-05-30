package com.griddynamics.jetbulb.interview;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTestInterviewTest {

    private final FizzBuzzTestInterview fizzBuzzTestInterview = new FizzBuzzTestInterview();

    @Test
    public void testFizz() {
        byte[] result = fizzBuzzTestInterview.FizzBuzzTest(3);
        assertArrayEquals("Fizz".getBytes(), result);
    }

    @Test
    public void testBuzz() {
        byte[] result = fizzBuzzTestInterview.FizzBuzzTest(5);
        assertArrayEquals("Buzz".getBytes(), result);
    }

    @Test
    public void testFizzBuzz() {
        byte[] result = fizzBuzzTestInterview.FizzBuzzTest(15);
        assertArrayEquals("FizzBuzz".getBytes(), result);
    }

    @Test
    public void testNotDivisibleBy3Or5() {
        Executable executable = () -> fizzBuzzTestInterview.FizzBuzzTest(17);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, executable);
        assertEquals("Not implemented yet", exception.getMessage());
    }

    @Test
    public void testFizzBuzzLargeNumber() {
        byte[] result = fizzBuzzTestInterview.FizzBuzzTest(30);
        assertArrayEquals("FizzBuzz".getBytes(), result);
    }
    @Test
    public void testFizzLargeNumber() {
        byte[] result = fizzBuzzTestInterview.FizzBuzzTest(9);
        assertArrayEquals("Fizz".getBytes(), result);
    }

    @Test
    public void testBuzzLargeNumber() {
        byte[] result = fizzBuzzTestInterview.FizzBuzzTest(20);
        assertArrayEquals("Buzz".getBytes(), result);
    }
}
