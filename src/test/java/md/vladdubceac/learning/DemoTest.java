package md.vladdubceac.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
//@DisplayNameGeneration(DemoTest.ReplaceCamelCase.class)
public class DemoTest {

    Demo demo;

    @BeforeEach
    void setupBeforeEach() {
        demo = new Demo();
//        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @Test
    @DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals() {
        System.out.println("Running test : testEqualsAndNotEquals");
        assertEquals(6, demo.add(2, 4), "2+4 must be 6");
        assertNotEquals(9, demo.add(2, 4), "2+4 must not be 9");
    }

    @Test
    @DisplayName("Null and Not Null")
    void testNullAndNotNull() {
        System.out.println("Running test : testNullAndNotNull");
        String str1 = null;
        String str2 = "";
        assertNull(demo.checkNull(str1), "Object should be null");
        assertNotNull(demo.checkNull(str2), "Object should not be null");
    }

    @DisplayName("Same and Not Same")
    @Test
    void testSameAndNotSame() {
        String str = "luv2code";

        assertSame(demo.getHello(), demo.getHelloDuplicate(), "Object should refer to same object");
        assertNotSame(str, demo.getHello(), "Objects should not refer to same object");
    }

    @DisplayName("True and False")
    @Test
    void testTrueFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demo.isGreater(gradeOne, gradeTwo), "This should return true");
        assertFalse(demo.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals() {
        String[] stringArray = {"A", "B", "C"};

        assertArrayEquals(stringArray, demo.getFirstThreeLettersOfAlphabet(), "Arrays should be the same");
    }

    @DisplayName("Iterable equals")
    @Test
    void testIterableEquals() {
        List<String> theList = List.of("luv", "2", "code");
        assertIterableEquals(theList, demo.getWordsList(), "Expected list should be same as actual list");
    }

    @DisplayName("Lines match")
    @Test
    void testLinesMatch() {
        List<String> theList = List.of("luv", "2", "code");

        assertLinesMatch(theList, demo.getWordsList(), "Lines should match");
    }

    @DisplayName("Throws and Does Not Throw")
    @Test
    void testThrowsAndDoesNotThrow() {
        assertThrows(Exception.class, () -> {
            demo.throwException(-1);
        }, "Should throw exception");

        assertDoesNotThrow(() -> {
            demo.throwException(0);
        }, "Should not throw exception");
    }

    @DisplayName("Timeout")
    @Test
    void testTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
            demo.checkTimeout();
        }, "Method should execute in 3 seconds");
    }

    /*
    @AfterEach
    void tearDownAfterEach(){
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @BeforeAll
    static void setupBeforeEachClass(){
        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
    }

    @AfterAll
    static void tearDownAfterAll(){
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }
     */


    static class ReplaceCamelCase extends DisplayNameGenerator.Standard {
        public ReplaceCamelCase() {
        }

        public String generateDisplayNameForClass(Class<?> testClass) {
            return this.cameCase(super.generateDisplayNameForClass(testClass));
        }

        public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
            return this.cameCase(super.generateDisplayNameForNestedClass(nestedClass));
        }

        public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
            return this.cameCase(testMethod.getName());
        }

        private String cameCase(String name) {
            StringBuilder result = new StringBuilder();
            boolean nextUpper = false;

            char[] charArray = name.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char ch = charArray[i];
                if (i == 0 && Character.isUpperCase(ch)) {
                    result.append(Character.toLowerCase(ch));
                    continue;
                }
                if (ch == '_' || ch == ' ') {
                    nextUpper = true;
                    result.append(' ');
                    continue;
                }
                if (nextUpper) {
                    result.append(Character.toUpperCase(ch));
                    nextUpper = false;
                } else {
                    result.append(ch);
                }
            }
            return result.toString();
        }
    }
}
