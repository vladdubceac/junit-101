package md.vladdubceac.learning.tdd;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1,101).forEach(number-> System.out.println(FizzBuzz.compute(number)));
    }
}
