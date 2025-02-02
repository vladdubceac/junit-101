package md.vladdubceac.learning;

import java.util.List;

public class Demo {

    private String hello = "Hello, World";
    private String helloDuplicate = hello;
    private String[] firstThreeLettersOfAlphabet = {"A", "B", "C"};
    private List<String> wordsList = List.of("Hello","World");

    public List<String> getWordsList() {
        return wordsList;
    }

    public String getHello() {
        return hello;
    }

    public String getHelloDuplicate() {
        return helloDuplicate;
    }

    public String[] getFirstThreeLettersOfAlphabet() {
        return firstThreeLettersOfAlphabet;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public Object checkNull(Object obj) {
        if (obj != null) {
            return obj;
        }
        return null;
    }

    public Boolean isGreater(int n1, int n2) {
        if (n1 > n2) {
            return true;
        }
        return false;
    }

    public String throwException(int a) throws Exception {
        if (a < 0) {
            throw new Exception("Value should be greater than or equal to 0");
        }
        return "Value is greater than or equal to 0";
    }

    public void checkTimeout() throws InterruptedException {
        System.out.println("I am going to sleep");
        Thread.sleep(2000);
        System.out.println("Sleeping over");
    }
}
