public class prog7f {

    static void test(int a, int b, int expected) {

        int result = a + b;

        if (result == expected)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }

    public static void main(String[] args) {

        test(2, 3, 5);
        test(10, 4, 14);
        test(3, 3, 6);
        test(5, 5, 11);
    }
}

