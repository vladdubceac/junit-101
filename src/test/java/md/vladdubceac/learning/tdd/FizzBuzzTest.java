package md.vladdubceac.learning.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvFileSources;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {

    // If number is divisible by 3, print Fizz
    // If number is divisible by 5, print Buzz
    // If number is divisible by 3 and 5, print FizzBuzz
    // If number is NOT divisible by 3 or 5, then print the number

    @DisplayName("Divisible by 3")
    @Test
    @Order(1)
    void testForDivisibleBy3() {
//        fail("fail");
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(234), "Should return Fizz");
    }

    @DisplayName("Divisible by 5")
    @Test
    @Order(2)
    void testForDivisibleBy5() {
        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(340), "Should return Buzzz");
    }

    @DisplayName("Divisible by 3 and by 5")
    @Test
    @Order(3)
    void testForDivisibleBy3AndBy5() {
        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(300), "Should return FizzBuzz");
    }

    @DisplayName("NOT divisible by 3 or by 5")
    @Test
    @Order(4)
    void testNotDivisibleBy3orBy5() {
        String expected = "8";

        assertEquals(expected, FizzBuzz.compute(8), "Should return 8");
    }

    @DisplayName("Testing with Small data file")
    @ParameterizedTest(name = "value = {0}, expected = {1}")
    @CsvFileSource(resources="/small-test-data.csv")
    @Order(5)
    void testSmallDataFile(int value, String expected){
        assertEquals(expected, FizzBuzz.compute(value));
    }

    @DisplayName("Testing with Medium data file")
    @ParameterizedTest(name = "value = {0}, expected = {1}")
    @CsvFileSource(resources="/medium-test-data.csv")
    @Order(6)
    void testMediumDataFile(int value, String expected){
        assertEquals(expected, FizzBuzz.compute(value));
    }

    @DisplayName("Testing with Large data file")
    @ParameterizedTest(name = "value = {0}, expected = {1}")
    @CsvFileSource(resources="/large-test-data.csv")
    @Order(7)
    void testLargeDataFile(int value, String expected){
        assertEquals(expected, FizzBuzz.compute(value));
    }
}
