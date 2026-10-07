import java.io.*;

public class prog9 {

    static PrintWriter pw;

    static void test(String name, Object actual, Object expected) {

        if (actual.equals(expected))
            pw.println(name + ": PASS");
        else
            pw.println(name + ": FAIL");
    }

    public static void main(String[] args) throws Exception {

        pw = new PrintWriter("log.txt");

        test("Addition", 2 + 2, 4);
        test("Subtraction", 10 - 5, 5);
        test("Multiplication", 3 * 3, 10);
        test("String", "abc".toUpperCase(), "ABC");

        pw.close();

        System.out.println("Tests completed. Check log.txt");
    }
}
